package mahos.Dialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.Gravity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.widget.Button;
import android.widget.LinearLayout;
public class DialogHtmlByAhmed extends Dialog {
    private static final String PREFS_NAME = "Ahmedalhrrani";
    private static final String KEY_SHOWN = "shown";
    public DialogHtmlByAhmed(final Context context) {
        super(context);
        LinearLayout layout = new LinearLayout(context);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(40, 40, 40, 40);
        WebView webView = new WebView(context);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webView.loadUrl("file:///android_asset/index.html");
        LinearLayout.LayoutParams webParams = new LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT, 0, 1.0f);
        layout.addView(webView, webParams);
        Button btnExit = new Button(context);
        btnExit.setText("Exit");
        btnExit.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					dismiss();
				}
			});
        Button btnTelegram = new Button(context);
        btnTelegram.setText("Join Telegram");
        btnTelegram.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/maho_s9")); // استبدل برابط قناتك
					context.startActivity(browserIntent);
				}
			});
        LinearLayout buttonsLayout = new LinearLayout(context);
        buttonsLayout.setOrientation(LinearLayout.HORIZONTAL);

        LinearLayout.LayoutParams exitParams = new LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        exitParams.gravity = Gravity.LEFT;
        btnExit.setLayoutParams(exitParams);

        LinearLayout.LayoutParams telegramParams = new LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        telegramParams.gravity = Gravity.RIGHT;
        btnTelegram.setLayoutParams(telegramParams);

        buttonsLayout.addView(btnExit);
        buttonsLayout.addView(btnTelegram);
        layout.addView(buttonsLayout);

        setContentView(layout);
    }
    public static void get(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        boolean shown = prefs.getBoolean(KEY_SHOWN, false);
        if (!shown) {
            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean(KEY_SHOWN, true);
            editor.apply();

            DialogHtmlByAhmed dialog = new DialogHtmlByAhmed(context);
            dialog.show();
        }
    }
}

