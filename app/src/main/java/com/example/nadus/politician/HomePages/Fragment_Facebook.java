package com.example.nadus.politician.HomePages;

/**
 * Created by nadus on 16-11-2017.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.nadus.politician.R;

/**
 * Created by Belal on 18/09/16.
 */


public class Fragment_Facebook extends Fragment {
    WebView mWebView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.fragment_fb, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mWebView = (WebView) view.findViewById(R.id.webviewf);


                mWebView.getSettings().setJavaScriptEnabled(true);
                mWebView.setWebViewClient(new WebViewClient() {
                    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {

                    }
                });

                mWebView .loadUrl("http://www.facebook.com/narendramodi/");

        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Facebook");
    }
}