package com.lolgamequiz.my;


import java.io.InputStream;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.model.people.Person;

//public class MainActivity extends Activity implements OnClickListener,
//        ConnectionCallbacks, OnConnectionFailedListener {
//
//    private static final int RC_SIGN_IN = 0;
//    // Logcat tag
//    private static final String TAG = "MainActivity";
//
//    // Profile pic image size in pixels
//    private static final int PROFILE_PIC_SIZE = 400;
//
//    // Google client to interact with Google API
//    private GoogleApiClient mGoogleApiClient;
//
//
//    // A flag indicating that a PendingIntent is in progress and prevents us
//    // from starting further intents.
//
//    private boolean mIntentInProgress;
//
//    private boolean mSignInClicked;
//
//    private ConnectionResult mConnectionResult;
//
//    private SignInButton btnSignIn;
//    private Button btnSignOut, btnRevokeAccess;
//    private ImageView imgProfilePic;
//    private TextView txtName, txtEmail;
//    private LinearLayout llProfileLayout;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        btnSignIn = (SignInButton) findViewById(R.id.btn_sign_in);
//        btnSignOut = (Button) findViewById(R.id.btn_sign_out);
//        btnRevokeAccess = (Button) findViewById(R.id.btn_revoke_access);
//        imgProfilePic = (ImageView) findViewById(R.id.imgProfilePic);
//        txtName = (TextView) findViewById(R.id.txtName);
//        txtEmail = (TextView) findViewById(R.id.txtEmail);
//        llProfileLayout = (LinearLayout) findViewById(R.id.llProfile);
//
//        // Button click listeners
//        btnSignIn.setOnClickListener(this);
//        btnSignOut.setOnClickListener(this);
//        btnRevokeAccess.setOnClickListener(this);
//
//        mGoogleApiClient = new GoogleApiClient.Builder(this)
//                .addConnectionCallbacks(this)
//                .addOnConnectionFailedListener(this).addApi(Plus.API, null)
//                .addScope(Plus.SCOPE_PLUS_LOGIN).build();
//    }
//
//    protected void onStart() {
//        super.onStart();
//        mGoogleApiClient.connect();
//    }
//
//    protected void onStop() {
//        super.onStop();
//        if (mGoogleApiClient.isConnected()) {
//            mGoogleApiClient.disconnect();
//        }
//    }
//
//
//    // Method to resolve any signin errors
//    private void resolveSignInError() {
//        if (mConnectionResult.hasResolution()) {
//            try {
//                mIntentInProgress = true;
//                mConnectionResult.startResolutionForResult(this, RC_SIGN_IN);
//            } catch (SendIntentException e) {
//                mIntentInProgress = false;
//                mGoogleApiClient.connect();
//            }
//        }
//    }
//
//    @Override
//    public void onConnectionFailed(ConnectionResult result) {
//        if (!result.hasResolution()) {
//            GooglePlayServicesUtil.getErrorDialog(result.getErrorCode(), this,
//                    0).show();
//            return;
//        }
//
//        if (!mIntentInProgress) {
//            // Store the ConnectionResult for later usage
//            mConnectionResult = result;
//
//            if (mSignInClicked) {
//                // The user has already clicked 'sign-in' so we attempt to
//                // resolve all
//                // errors until the user is signed in, or they cancel.
//                resolveSignInError();
//            }
//        }
//
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int responseCode,
//                                    Intent intent) {
//        if (requestCode == RC_SIGN_IN) {
//            if (responseCode != RESULT_OK) {
//                mSignInClicked = false;
//            }
//
//            mIntentInProgress = false;
//
//            if (!mGoogleApiClient.isConnecting()) {
//                mGoogleApiClient.connect();
//            }
//        }
//    }
//
//    @Override
//    public void onConnected(Bundle arg0) {
//        mSignInClicked = false;
//        Toast.makeText(this, "User is connected!", Toast.LENGTH_LONG).show();
//
//        // Get user's information
//        getProfileInformation();
//
//        // Update the UI after signin
//        updateUI(true);
//
//    }
//
//
//     // Updating the UI, showing/hiding buttons and profile layout
//
//    private void updateUI(boolean isSignedIn) {
//        if (isSignedIn) {
//            btnSignIn.setVisibility(View.GONE);
//            btnSignOut.setVisibility(View.VISIBLE);
//            btnRevokeAccess.setVisibility(View.VISIBLE);
//            llProfileLayout.setVisibility(View.VISIBLE);
//        } else {
//            btnSignIn.setVisibility(View.VISIBLE);
//            btnSignOut.setVisibility(View.GONE);
//            btnRevokeAccess.setVisibility(View.GONE);
//            llProfileLayout.setVisibility(View.GONE);
//        }
//    }
//
//
//    // Fetching user's information name, email, profile pic
//
//    private void getProfileInformation() {
//        try {
//            if (Plus.PeopleApi.getCurrentPerson(mGoogleApiClient) != null) {
//                Person currentPerson = Plus.PeopleApi
//                        .getCurrentPerson(mGoogleApiClient);
//                String personName = currentPerson.getDisplayName();
//                String personPhotoUrl = currentPerson.getImage().getUrl();
//                String personGooglePlusProfile = currentPerson.getUrl();
//                String email = Plus.AccountApi.getAccountName(mGoogleApiClient);
//
//                Log.e(TAG, "Name: " + personName + ", plusProfile: "
//                        + personGooglePlusProfile + ", email: " + email
//                        + ", Image: " + personPhotoUrl);
//
//                txtName.setText(personName);
//                txtEmail.setText(email);
//
//                // by default the profile url gives 50x50 px image only
//                // we can replace the value with whatever dimension we want by
//                // replacing sz=X
//                personPhotoUrl = personPhotoUrl.substring(0,
//                        personPhotoUrl.length() - 2)
//                        + PROFILE_PIC_SIZE;
//
//                new LoadProfileImage(imgProfilePic).execute(personPhotoUrl);
//
//            } else {
//                Toast.makeText(getApplicationContext(),
//                        "Person information is null", Toast.LENGTH_LONG).show();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void onConnectionSuspended(int arg0) {
//        mGoogleApiClient.connect();
//        updateUI(false);
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    // Button on click listener
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.btn_sign_in:
//                // Signin button clicked
//                signInWithGplus();
//                break;
//            case R.id.btn_sign_out:
//                // Signout button clicked
//                signOutFromGplus();
//                break;
//            case R.id.btn_revoke_access:
//                // Revoke access button clicked
//                revokeGplusAccess();
//                break;
//        }
//    }
//
//
//    // Sign-in into google
//    private void signInWithGplus() {
//        if (!mGoogleApiClient.isConnecting()) {
//            mSignInClicked = true;
//            resolveSignInError();
//        }
//    }
//
//
//    // Sign-out from google
//    private void signOutFromGplus() {
//        if (mGoogleApiClient.isConnected()) {
//            Plus.AccountApi.clearDefaultAccount(mGoogleApiClient);
//            mGoogleApiClient.disconnect();
//            mGoogleApiClient.connect();
//            updateUI(false);
//        }
//    }
//
//    /**
//     * Revoking access from google
//     * */
//    private void revokeGplusAccess() {
//        if (mGoogleApiClient.isConnected()) {
//            Plus.AccountApi.clearDefaultAccount(mGoogleApiClient);
//            Plus.AccountApi.revokeAccessAndDisconnect(mGoogleApiClient)
//                    .setResultCallback(new ResultCallback<Status>() {
//                        @Override
//                        public void onResult(Status arg0) {
//                            Log.e(TAG, "User access revoked!");
//                            mGoogleApiClient.connect();
//                            updateUI(false);
//                        }
//
//                    });
//        }
//    }
//
//    /**
//     * Background Async task to load user profile picture from url
//     * */
//    private class LoadProfileImage extends AsyncTask<String, Void, Bitmap> {
//        ImageView bmImage;
//
//        public LoadProfileImage(ImageView bmImage) {
//            this.bmImage = bmImage;
//        }
//
//        protected Bitmap doInBackground(String... urls) {
//            String urldisplay = urls[0];
//            Bitmap mIcon11 = null;
//            try {
//                InputStream in = new java.net.URL(urldisplay).openStream();
//                mIcon11 = BitmapFactory.decodeStream(in);
//            } catch (Exception e) {
//                Log.e("Error", e.getMessage());
//                e.printStackTrace();
//            }
//            return mIcon11;
//        }
//
//        protected void onPostExecute(Bitmap result) {
//            bmImage.setImageBitmap(result);
//        }
//    }
//
//}
//
//
//




































import android.support.v4.app.ActionBarDrawerToggle;

import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;


public class MainActivity extends ActionBarActivity
{
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;

    // nav drawer title
    private CharSequence mDrawerTitle;

    // used to store app title
    private CharSequence mTitle;

    // slide menu items
    private String[] navMenuTitles;
    private TypedArray navMenuIcons;

    private ArrayList<NavDrawerItem> navDrawerItems;
    private NavDrawerListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTitle = mDrawerTitle = getTitle();

        // load slide menu items
        navMenuTitles = getResources().getStringArray(R.array.nav_drawer_items);

        // nav drawer icons from resources
        navMenuIcons = getResources().obtainTypedArray(R.array.nav_drawer_icons);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.list_slidermenu);

        navDrawerItems = new ArrayList<NavDrawerItem>();

        // adding nav drawer items to array
        // Home
        navDrawerItems.add(new NavDrawerItem(navMenuTitles[0], navMenuIcons.getResourceId(0, -1)));
        // Find People
        navDrawerItems.add(new NavDrawerItem(navMenuTitles[1], navMenuIcons.getResourceId(1, -1)));
        // Photos
        navDrawerItems.add(new NavDrawerItem(navMenuTitles[2], navMenuIcons.getResourceId(2, -1)));
        // Communities, Will add a counter here
        navDrawerItems.add(new NavDrawerItem(navMenuTitles[3], navMenuIcons.getResourceId(3, -1), true, "22"));
        // Pages
        navDrawerItems.add(new NavDrawerItem(navMenuTitles[4], navMenuIcons.getResourceId(4, -1)));
        // What's hot, We  will add a counter here
        navDrawerItems.add(new NavDrawerItem(navMenuTitles[5], navMenuIcons.getResourceId(5, -1), true, "50+"));


        // Recycle the typed array
        navMenuIcons.recycle();

        // setting the nav drawer list adapter
        adapter = new NavDrawerListAdapter(getApplicationContext(),
                navDrawerItems);
        mDrawerList.setAdapter(adapter);

        // enabling action bar app icon and behaving it as toggle button



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
                R.drawable.ic_drawer, //nav menu toggle icon
                R.string.app_name, // nav drawer open - description for accessibility
                R.string.app_name // nav drawer close - description for accessibility
        ){
            public void onDrawerClosed(View view)
            {
                getSupportActionBar().setTitle(mTitle);
                // calling onPrepareOptionsMenu() to show action bar icons
                supportInvalidateOptionsMenu();
                //invalidateOptionsMenu();
            }

            public void onDrawerOpened(View drawerView)
            {
                getSupportActionBar().setTitle(mDrawerTitle);
                // calling onPrepareOptionsMenu() to hide action bar icons
                supportInvalidateOptionsMenu();
                //invalidateOptionsMenu();
            }
        };
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        if (savedInstanceState == null)
        {
            // on first time display view for first nav item
            displayView(0);
        }
        mDrawerList.setOnItemClickListener(new SlideMenuClickListener());
    }

    private class SlideMenuClickListener implements
            ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position,
                                long id) {
            // display view for selected nav drawer item
            displayView(position);
        }
    }

    private void displayView(int position)
    {
        // update the main content by replacing fragments
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new GameFragment();
                break;
            case 1:
                fragment = new HeroQuizModePickerFragment();
                break;
            case 2:
                fragment = new SkillQuizModePickerFragment();
                break;
            case 3:
                fragment = new ScoreFragment();
                break;
            case 4:
                fragment = new GameFragment();
                //fragment = new PagesFragment();
                break;
            case 5:
                fragment = new GameFragment();
                //fragment = new WhatsHotFragment();
                break;

            default:
                break;
        }
        if (fragment != null) {

            FragmentManager fragmentManager =  getSupportFragmentManager();
            //FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit();

            // update selected item and title, then close the drawer
            mDrawerList.setItemChecked(position, true);
            mDrawerList.setSelection(position);
            setTitle(navMenuTitles[position]);
            mDrawerLayout.closeDrawer(mDrawerList);
        } else {
            // error in creating fragment
            Log.e("MainActivity", "Error in creating fragment");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // toggle nav drawer on selecting action bar app icon/title
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        // Handle action bar actions click
        switch (item.getItemId()) {
            case R.id.action_settings:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


     //Called when invalidateOptionsMenu() is triggered

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        // if nav drawer is opened, hide the action items
        boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);
        menu.findItem(R.id.action_settings).setVisible(!drawerOpen);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void setTitle(CharSequence title) {
        mTitle = title;
        getSupportActionBar().setTitle(mTitle);
    }


     //When using the ActionBarDrawerToggle, you must call it during
     //onPostCreate() and onConfigurationChanged()...


    @Override
    protected void onPostCreate(Bundle savedInstanceState)
    {
        super.onPostCreate( savedInstanceState );
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig)
    {
        super.onConfigurationChanged(newConfig);
        // Pass any configuration change to the drawer toggls
        mDrawerToggle.onConfigurationChanged(newConfig);
    }
}

