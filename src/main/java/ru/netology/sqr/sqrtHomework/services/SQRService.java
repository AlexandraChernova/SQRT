package ru.netology.sqr.sqrtHomework.services;

public class SQRService {

    public int sqrCount(int x, int y) {
        int root = 0;

        for (int i = 0; i <= y; i++) {
            if ((i * i >= x) && (i * i <= y)) {
                root++;
            }
        }
        return root;
    }
}
