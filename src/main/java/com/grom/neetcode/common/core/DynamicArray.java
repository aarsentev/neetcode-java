package com.grom.neetcode.common.core;

public class DynamicArray {

    int[] array;
    private int size;

    public DynamicArray(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if (size == array.length) {
            resize();
        }
        array[size] = n;
        size += 1;
    }

    public int popback() {
        int popped_num = array[size - 1];
        array[size - 1] = 0;
        size -= 1;
        return popped_num;
    }

    private void resize() {
        int[] new_array = new int[size * 2];
        for (int i = 0; i < size; i++) {
            new_array[i] = array[i];
        }
        array = new_array;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return array.length;
    }

}


