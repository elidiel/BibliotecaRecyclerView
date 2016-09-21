package com.levirchianca.bibliotecarecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;

/**
 * Created by Aluno on 21/09/2016.
 */
public class RecyclerItemClickListener implements RecyclerView.OnItemTouchListener {


    OnItemClickListener mListener;
    GestureDetector mGesturedetector;

    public interface OnItemClickListener {
        void onItemClick(View view, int position);

        void onItemLongClick(View view, int position);
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView view, MotionEvent e) {
        mGesturedetector.onTouchEvent(e);
        return false;
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }

    public RecyclerItemClickListener(Context context, final RecyclerView view, OnItemClickListener listener) {
        mListener = listener;
        mGesturedetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            public boolean onSingleTapUp(MotionEvent e) {
                super.onSingleTapUp(e);
                View childView = view.findChildViewUnder(e.getX(), e.getY());
                if (childView != null && mListener != null) {
                    mListener.onItemClick(childView, view.getChildAdapterPosition(childView));

                }
                return true;
            }

            public void onLongPress(MotionEvent e) {
                super.onLongPress(e);
                View childView = view.findChildViewUnder(e.getX(), e.getY());
                if (childView != null && mListener != null) {
                    mListener.onItemLongClick(childView, view.getChildAdapterPosition(childView));
                }

            }

        });


    }
}
