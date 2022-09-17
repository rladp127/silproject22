package com.example.lab1;

public class Word {
    private int id; // index
    private int level; // 난이도
    private String word; // 영단어
    private String meaning; // 뜻

    // 생성자
    Word() {}
    Word(int id, int level, String word, String meaning) {
        this.id = id;
        this.level = level;
        this.word = word;
        this.meaning = meaning;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        String slevel = "";
        for (int i = 0; i < level; i++) slevel += "*"; // level 만큼 * 저장
        String str = String.format("%-3s", slevel)
                + String.format("%15s", word) + "  " + meaning; // *(level) + 단어 + 뜻
        return str;
    }

    public String toFileString() {
        return this.level + "|" + this.word + "|" + this.meaning;
    }
}
