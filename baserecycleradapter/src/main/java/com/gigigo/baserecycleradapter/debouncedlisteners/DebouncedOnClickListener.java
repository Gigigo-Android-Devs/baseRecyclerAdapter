package com.gigigo.baserecycleradapter.debouncedlisteners;

import android.view.View;
import com.gigigo.baserecycleradapter.viewholder.BaseViewHolder;

public abstract class DebouncedOnClickListener implements BaseViewHolder.OnItemClickListener, DebouncedListener {
  private final DebouncedClickHandler debouncedClickHandler;

  protected DebouncedOnClickListener() {
    this.debouncedClickHandler = new DebouncedClickHandler(this);
  }

  @Override public void onItemClick(int position, View view) {
    debouncedClickHandler.invokeDebouncedClick(position, view);
  }
}
