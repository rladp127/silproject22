package com.example.lab1;

import java.util.Scanner;

// wordCRUD 기능을 구현하는 전체적 관리 역할
public class WordManager {
    WordCRUD wordCRUD;
    Scanner s = new Scanner(System.in);
    WordManager() {
        wordCRUD = new WordCRUD(s);
    } // 생성자
    public int selectMenu() {
        Scanner s = new Scanner(System.in);
        System.out.print("*** 영단어 마스터 ***\n" +
                "********************\n" +
                "1. 모든 단어 보기\n" +
                "2. 수준별 단어 보기\n" +
                "3. 단어 검색\n" +
                "4. 단어 추가\n" +
                "5. 단어 수정\n" +
                "6. 단어 삭제\n" +
                "7. 파일 저장\n" +
                "0. 나가기\n" +
                "********************\n" +
                "=> 원하는 메뉴는? ");

        return s.nextInt(); // 선택한 메뉴 반환
    }
    public void start() {
        WordCRUD.loadFile();
        while(true) {
            int menu = selectMenu();
            if (menu == 0) {
                System.out.println("프로그램 종료");
                break;
            }

            if (menu == 1) { // 모든 단어 보기
                wordCRUD.listAll();
            }
            else if (menu == 2) { // 수준별 단어 보기
                wordCRUD.searchLevel();
            }
            else if (menu == 3) { // 단어 검색
                wordCRUD.searchWord();
            }
            else if (menu == 4) { // 단어 추가
                wordCRUD.addItem();
            }
            else if (menu == 5) { // update
                wordCRUD.updateItem();
            }
            else if (menu == 6) { // delete
                wordCRUD.deleteItem();
            }
            else if (menu == 7) { // save data
                wordCRUD.saveFile();
            }
        }
    }
}
