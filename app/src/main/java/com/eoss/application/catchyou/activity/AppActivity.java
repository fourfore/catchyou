package com.eoss.application.catchyou.activity;

import android.app.Activity;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.eoss.application.catchyou.Fragment.NearByListFragment;
import com.eoss.application.catchyou.Fragment.ProfileFragment;
import com.eoss.application.catchyou.Fragment.SystemFragment;
import com.eoss.application.catchyou.R;
import com.parse.ParseFacebookUtils;
import com.parse.ParseObject;
import com.parse.ParseQueryAdapter;
import com.parse.ParseUser;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;
    public class AppActivity extends FragmentActivity {
    private BottomBar mBottomBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        Log.d("test","app activity");

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.tab_near) {
                    // Create fragment and give it an argument specifying the article it should show
                    NearByListFragment newFragment = new NearByListFragment();
                    Bundle args = new Bundle();

                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                    // Replace          whatever is in the fragment_container view with this fragment,
                    // and add          the transaction to the back stack so the user can navigate back
                    transaction.replace(R.id.contentContainer, newFragment);
                    transaction.addToBackStack(null);

                    // Commit the transaction
                    transaction.commit();

                }
                if (tabId == R.id.tab_profile) {
                    ProfileFragment newFragment = new ProfileFragment();
                    Bundle args = new Bundle();
//                    ParseQueryAdapter<ParseObject> adapter = new ParseQueryAdapter<ParseObject>(AppActivity.this, "Instrument");
//                    adapter.setTextKey("name");
//                    adapter.setImageKey("photo");
//
//                    ListView listView = (ListView) findViewById(R.id.listview);
//                    listView.setAdapter(adapter);

                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.contentContainer, newFragment);
                    transaction.addToBackStack(null);
                    transaction.commit();
                }
                if (tabId == R.id.tab_setting) {
                    SystemFragment newFragment = new SystemFragment();
                    Bundle args = new Bundle();
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.contentContainer, newFragment);
                    transaction.addToBackStack(null);
                    transaction.commit();
                }
            }
        });
    }

    public void onClickLogout(View view){
        ParseUser user = new ParseUser();
        user.getCurrentUser().logOut();
        Intent intent = new Intent(AppActivity.this,LoginActivity.class);
        startActivity(intent);
        finish();
    }


}
