package com.kotlin.mvvm.utils.adapterUtils;

/**
 * Helper interface to simulate Swipe, Item position changing
 */
public interface ItemTouchHelperAdapter {

    void onItemMove(int fromPosition, int toPosition);

    void onItemDismiss(int position);
}