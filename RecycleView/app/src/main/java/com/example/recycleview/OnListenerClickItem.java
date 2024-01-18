package com.example.recycleview;

public interface OnListenerClickItem {
    void onClick(int position);

    void onDelete(int position, Dog dog);
}
