package t.s.t;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActTest extends AppCompatActivity {

    TextView txt_ques, txt_Goz1, txt_Goz2, txt_Goz3, txt_Goz4, txt_Goz5, txt_counter;
    int score = 0, counter = 1, total_question = 13;
    MediaPlayer snd_click, mp;
//    String[][] questions_list = new String[13][6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_test);

        txt_ques = findViewById(R.id.txt_ques);
        txt_Goz1 = findViewById(R.id.txt_Goz1);
        txt_Goz2 = findViewById(R.id.txt_Goz2);
        txt_Goz3 = findViewById(R.id.txt_Goz3);
        txt_Goz4 = findViewById(R.id.txt_Goz4);
        txt_Goz5 = findViewById(R.id.txt_Goz5);
        txt_counter = findViewById(R.id.txt_counter);

        //مقدار دهی یک وویس کوتاه برای کلیک روی گزینه ها
        snd_click = MediaPlayer.create(this, R.raw.button);

        //مقدار دهی یک ارایه دو بعدی که تمامی استرینگ های مربوط به تست شخصیت شناسی رو ذخیره میکنه
        //سوال 1
//        questions_list[0][0] = getResources().getString(R.string.question1);
//        questions_list[0][1] = getResources().getString(R.string.question1_1);
//        questions_list[0][2] = getResources().getString(R.string.question1_2);
//        questions_list[0][3] = getResources().getString(R.string.question1_3);
//        questions_list[0][4] = getResources().getString(R.string.question1_4);
//        questions_list[0][5] = getResources().getString(R.string.question1_5);
//        //سوال 2
//        questions_list[1][0] = getResources().getString(R.string.question2);
//        questions_list[1][1] = getResources().getString(R.string.question2_1);
//        questions_list[1][2] = getResources().getString(R.string.question2_2);
//        questions_list[1][3] = getResources().getString(R.string.question2_3);
//        questions_list[1][4] = getResources().getString(R.string.question2_4);
//        questions_list[1][5] = getResources().getString(R.string.question2_5);
        // سوال 3

        setQuestion();

        mp = MediaPlayer.create(this, R.raw.music);

    }

    //رویداد کلیک روی گزینه ها
    @SuppressLint("NonConstantResourceId")
    public void txts_click(View view) {

        int id = view.getId();

        switch (id) {
            case R.id.txt_Goz1:
                score++;
                break;
            case R.id.txt_Goz2:
                score = score + 2;
                break;
            case R.id.txt_Goz3:
                score = score + 3;
                break;
            case R.id.txt_Goz4:
                score = score + 4;
                break;
            case R.id.txt_Goz5:
                score = score + 5;
                break;

        }
        snd_click.start();
        counter++;
        setQuestion();
    }

    @SuppressLint("SetTextI18n")
    private void setQuestion() {
        txt_counter.setText(FaNum.convert("سوال " + counter + " از " + total_question));

        switch (counter) {
            case 1:
                txt_ques.setText(FaNum.convert(getResources().getString(R.string.question1)));
                txt_Goz1.setText(FaNum.convert(getResources().getString(R.string.question1_1)));
                txt_Goz2.setText(FaNum.convert(getResources().getString(R.string.question1_2)));
                txt_Goz3.setText(FaNum.convert(getResources().getString(R.string.question1_3)));
                txt_Goz4.setText(FaNum.convert(getResources().getString(R.string.question1_4)));
                txt_Goz5.setText(FaNum.convert(getResources().getString(R.string.question1_5)));
                break;
            case 2:
                txt_ques.setText(FaNum.convert(getResources().getString(R.string.question2)));
                txt_Goz1.setText(getResources().getString(R.string.question2_1));
                txt_Goz2.setText(getResources().getString(R.string.question2_2));
                txt_Goz3.setText(getResources().getString(R.string.question2_3));
                txt_Goz4.setText(getResources().getString(R.string.question2_4));
                txt_Goz5.setText(getResources().getString(R.string.question2_5));
                break;
            case 3:
                txt_ques.setText(FaNum.convert(getResources().getString(R.string.question3)));
                txt_Goz1.setText(getResources().getString(R.string.question3_1));
                txt_Goz2.setText(getResources().getString(R.string.question3_2));
                txt_Goz3.setText(getResources().getString(R.string.question3_3));
                txt_Goz4.setText(getResources().getString(R.string.question3_4));
                txt_Goz5.setText(getResources().getString(R.string.question3_5));
                break;
            case 4:
                txt_ques.setText(FaNum.convert(getResources().getString(R.string.question4)));
                txt_Goz1.setText(getResources().getString(R.string.question4_1));
                txt_Goz2.setText(getResources().getString(R.string.question4_2));
                txt_Goz3.setText(getResources().getString(R.string.question4_3));
                txt_Goz4.setText(getResources().getString(R.string.question4_4));
                txt_Goz5.setText(getResources().getString(R.string.question4_5));
                break;
            case 5:
                txt_ques.setText(FaNum.convert(getResources().getString(R.string.question5)));
                txt_Goz1.setText(getResources().getString(R.string.question5_1));
                txt_Goz2.setText(getResources().getString(R.string.question5_2));
                txt_Goz3.setText(getResources().getString(R.string.question5_3));
                txt_Goz4.setText(getResources().getString(R.string.question5_4));
                txt_Goz5.setText(getResources().getString(R.string.question5_5));
                break;
            case 6:
                txt_ques.setText(FaNum.convert(getResources().getString(R.string.question6)));
                txt_Goz1.setText(getResources().getString(R.string.question6_1));
                txt_Goz2.setText(getResources().getString(R.string.question6_2));
                txt_Goz3.setText(getResources().getString(R.string.question6_3));
                txt_Goz4.setText(getResources().getString(R.string.question6_4));
                txt_Goz5.setText(getResources().getString(R.string.question6_5));
                break;
            case 7:
                txt_ques.setText(FaNum.convert(getResources().getString(R.string.question7)));
                txt_Goz1.setText(getResources().getString(R.string.question7_1));
                txt_Goz2.setText(getResources().getString(R.string.question7_2));
                txt_Goz3.setText(getResources().getString(R.string.question7_3));
                txt_Goz4.setText(getResources().getString(R.string.question7_4));
                txt_Goz5.setText(getResources().getString(R.string.question7_5));
                break;
            case 8:
                txt_ques.setText(FaNum.convert(getResources().getString(R.string.question8)));
                txt_Goz1.setText(getResources().getString(R.string.question8_1));
                txt_Goz2.setText(getResources().getString(R.string.question8_2));
                txt_Goz3.setText(getResources().getString(R.string.question8_3));
                txt_Goz4.setText(getResources().getString(R.string.question8_4));
                txt_Goz5.setText(getResources().getString(R.string.question8_5));
                break;
            case 9:
                txt_ques.setText(FaNum.convert(getResources().getString(R.string.question9)));
                txt_Goz1.setText(getResources().getString(R.string.question9_1));
                txt_Goz2.setText(getResources().getString(R.string.question9_2));
                txt_Goz3.setText(getResources().getString(R.string.question9_3));
                txt_Goz4.setText(getResources().getString(R.string.question9_4));
                txt_Goz5.setText(getResources().getString(R.string.question9_5));
                break;
            case 10:
                txt_ques.setText(FaNum.convert(getResources().getString(R.string.question10)));
                txt_Goz1.setText(getResources().getString(R.string.question10_1));
                txt_Goz2.setText(getResources().getString(R.string.question10_2));
                txt_Goz3.setText(getResources().getString(R.string.question10_3));
                txt_Goz4.setText(getResources().getString(R.string.question10_4));
                txt_Goz5.setText(getResources().getString(R.string.question10_5));
                break;
            case 11:
                txt_ques.setText(FaNum.convert(getResources().getString(R.string.question11)));
                txt_Goz1.setText(getResources().getString(R.string.question11_1));
                txt_Goz2.setText(getResources().getString(R.string.question11_2));
                txt_Goz3.setText(getResources().getString(R.string.question11_3));
                txt_Goz4.setText(getResources().getString(R.string.question11_4));
                txt_Goz5.setText(getResources().getString(R.string.question11_5));
                break;
            case 12:
                txt_ques.setText(FaNum.convert(getResources().getString(R.string.question12)));
                txt_Goz1.setText(getResources().getString(R.string.question12_1));
                txt_Goz2.setText(getResources().getString(R.string.question12_2));
                txt_Goz3.setText(getResources().getString(R.string.question12_3));
                txt_Goz4.setText(getResources().getString(R.string.question12_4));
                txt_Goz5.setText(getResources().getString(R.string.question12_5));
                break;
            case 13:
                txt_ques.setText(FaNum.convert(getResources().getString(R.string.question13)));
                txt_Goz1.setText(getResources().getString(R.string.question13_1));
                txt_Goz2.setText(getResources().getString(R.string.question13_2));
                txt_Goz3.setText(getResources().getString(R.string.question13_3));
                txt_Goz4.setText(getResources().getString(R.string.question13_4));
                txt_Goz5.setText(getResources().getString(R.string.question13_5));
                break;
            default:
                setResult();
                break;

        }
    }

    //متد مشخص کردن نتیجه ازمون شخصیت شناسی بر اساس امتیاز بدست امده کاربر
    private void setResult() {

        String str_result = "";
        if (score <= 21) {
            str_result = getResources().getString(R.string.Res1);
        } else if (score > 21 && score <= 54) {
            str_result = getResources().getString(R.string.Res2);
        } else if (score >= 55 && score < 75) {
            str_result = getResources().getString(R.string.Res3);
        }

        //انتقال نتیجه بدست امده به اکتیوینی نمایش نتیجه ازمون
        Intent intent = new Intent(ActTest.this, ActResult.class);
        intent.putExtra("res", str_result);
        startActivity(intent);
        //با اجرای متد فینیش این اکتیویتی کاملا بسته میشود تا از اکتیویتی نتیجه دوباره به ازمون بر نگرده
        finish();
    }

    @Override
    protected void onResume() {
        mp.start();
        super.onResume();
    }

    @Override
    protected void onPause() {
        mp.pause();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mp.release();
        mp = null;

    }
}