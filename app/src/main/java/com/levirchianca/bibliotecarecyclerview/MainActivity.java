package com.levirchianca.bibliotecarecyclerview;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        final List<Livro> listaLivros = Livro.getLivros();
        recyclerView.setAdapter(new LivroAdapter(listaLivros, this));
        RecyclerView.LayoutManager layout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layout);
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, "Click simples em:"+ position, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onItemLongClick(View view, int position) {
                listaLivros.remove(position);
                recyclerView.getAdapter().notifyItemRemoved(position);
                Toast.makeText(MainActivity.this, "Click Longo em:"+ position, Toast.LENGTH_SHORT).show();
                recyclerView.setItemAnimator(new RecyclerView.ItemAnimator() {
                    @Override
                    public boolean animateDisappearance(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull ItemHolderInfo preLayoutInfo, @Nullable ItemHolderInfo postLayoutInfo) {
                        return false;
                    }

                    @Override
                    public boolean animateAppearance(@NonNull RecyclerView.ViewHolder viewHolder, @Nullable ItemHolderInfo preLayoutInfo, @NonNull ItemHolderInfo postLayoutInfo) {
                        return false;
                    }

                    @Override
                    public boolean animatePersistence(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull ItemHolderInfo preLayoutInfo, @NonNull ItemHolderInfo postLayoutInfo) {
                        return false;
                    }

                    @Override
                    public boolean animateChange(@NonNull RecyclerView.ViewHolder oldHolder, @NonNull RecyclerView.ViewHolder newHolder, @NonNull ItemHolderInfo preLayoutInfo, @NonNull ItemHolderInfo postLayoutInfo) {
                        return false;
                    }

                    @Override
                    public void runPendingAnimations() {

                    }

                    @Override
                    public void endAnimation(RecyclerView.ViewHolder item) {

                    }

                    @Override
                    public void endAnimations() {

                    }

                    @Override
                    public boolean isRunning() {
                        return false;
                    }
                });

            }
        })
        );
    }

}
