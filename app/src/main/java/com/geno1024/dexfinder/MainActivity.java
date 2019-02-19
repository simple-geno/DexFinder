package com.geno1024.dexfinder;

import android.app.*;
import android.os.*;
import java.io.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        try
	  	    {
	         		java.lang.Process p = Runtime.getRuntime().exec("su");
			         p.getOutputStream().write("ps | grep dex2oat\n".getBytes());
			         android.widget.TextView t = new android.widget.TextView(this);
			         t.setText(new BufferedReader(new InputStreamReader(p.getInputStream())).readLine());
            setContentView(t);
	      	}
		      catch (IOException e)
		      {}
    }
}
