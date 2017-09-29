package modularization.charles.com.modela.book;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

import modularization.charles.com.modela.R;
import modularization.charles.com.modela.module.Book;

/**
 * Created by Chenyc on 15/7/1.
 */
public class BooksFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private MyAdapter mAdapter;
    private ProgressBar mProgressBar;

    private List<Book> books = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.module1_fragment_books, null);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mProgressBar = (ProgressBar) view.findViewById(R.id.progressBar);
        mAdapter = new MyAdapter(this, getActivity());
        mRecyclerView.setAdapter(mAdapter);
        mProgressBar.setVisibility(View.VISIBLE);
        loadData();
        return view;
    }

    private void loadData() {
        for (int i = 0 ;i <= 20; i++){
            Book b = new Book();
            b.setAlt("1");
            b.setTitle("title" + i);
            books.add(b);
        }

        mAdapter.updateItems(books);
        mProgressBar.setVisibility(View.GONE);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
