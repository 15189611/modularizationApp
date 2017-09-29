package modularization.charles.com.modela;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mzule.activityrouter.annotation.Router;

import modularization.charles.com.modela.book.BooksFragment;

@Router("one_activity")
public class ModelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a);
        BooksFragment fragment = new BooksFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment, fragment).commit();
    }
}
