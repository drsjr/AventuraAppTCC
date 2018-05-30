package projetotcc.com.br.aventura;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import projetotcc.com.br.aventura.presenter.contract.MainContract;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private FragmentTransaction mTransaction;

    private AventuraFragment mAventura;
    private AventureiroFragment mAventureiro;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    loadAventureiro();
                    return true;
                case R.id.navigation_dashboard:
                    loadAventuras() ;
                    return true;
                case R.id.navigation_notifications:
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        mAventura = AventuraFragment.newInstance();
        mAventureiro = AventureiroFragment.newInstance();
    }

    @Override
    public void showProgress(boolean inProgress) {

    }

    private void loadAventuras()  {
        mTransaction = getTransaction();
        mTransaction.replace(R.id.menuContainer, mAventura, "Aventura");
        mTransaction.commit();
    }

    private void loadAventureiro() {
        mTransaction = getTransaction();
        mTransaction.replace(R.id.menuContainer, mAventureiro, "Aventureiro");
        mTransaction.commit();
    }

    private FragmentTransaction getTransaction() {
        return getSupportFragmentManager().beginTransaction();
    }
}
