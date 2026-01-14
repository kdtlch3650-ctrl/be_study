package be_study.quiz;

import java.util.Scanner;

public class Quiz20_GPT {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] menuStr = { "아메리카노", "카페라떼", "바닐라라떼" };
        int[] cost = { 3500, 4100, 4300 };

        String[] addOrderMenu = new String[10];
        int[] count = new int[10];
        int[] orderCost = new int[10];

        int total = 0;
        int menuIndex = 0; // 현재 저장 위치

        while (true) {

            System.out.println("========메뉴========");
            System.out.printf("1. %s %d원\n", menuStr[0], cost[0]);
            System.out.printf("2. %s %d원\n", menuStr[1], cost[1]);
            System.out.printf("3. %s %d원\n", menuStr[2], cost[2]);
            System.out.println("==================");

            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();

            System.out.print("수량 선택 : ");
            int qty = sc.nextInt();

            // **이미 주문한 동일 메뉴가 있는지 확인**
            boolean isExist = false;
            for (int i = 0; i < menuIndex; i++) {
                if (addOrderMenu[i].equals(menuStr[menu - 1])) {
                    count[i] += qty;
                    isExist = true;
                    break;
                }
            }

            // **신규 주문일 때만 배열에 추가**
            if (!isExist) {
                addOrderMenu[menuIndex] = menuStr[menu - 1];
                count[menuIndex] = qty;
                orderCost[menuIndex] = cost[menu - 1];
                menuIndex++;
            }

            sc.nextLine(); // 버퍼 제거

            System.out.print("추가 주문하시겠습니까?(y/n) : ");
            String check = sc.nextLine();

            if (check.equals("n")) {
                System.out.println("==================");
                for (int i = 0; i < menuIndex; i++) {
                    int price = orderCost[i] * count[i];
                    System.out.printf("%s %d잔 : %d원\n", addOrderMenu[i], count[i], price);
                    total += price;
                }
                System.out.println("==================");
                System.out.printf("총액: %d원\n", total);
                break;
            }
        }
    }
}