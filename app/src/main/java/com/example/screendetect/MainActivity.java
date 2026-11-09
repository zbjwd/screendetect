包com.example.screendetect；

进口android.图形学.色彩；
进口android.os.Bundle；
进口android.view.View；
进口android.widget.TextView；
进口 androidx.appcompat.app.AppCompatActivity;

公共 班级 MainActivity 延伸 AppCompatActivity {

    私人的 TextView 暗示;
    私人的 最终的 int[] 颜色 = {
颜色.白色，红色，绿色，蓝色，
颜色.黑色，颜色.黄色，颜色.青色，颜色.MAGENTA
    };
    私人的 最终的 线[] 姓名 = {
        "白色", "红色", "绿色", "蓝色",
        "黑色", "黄色", "青色", "品红"
    };
    私人的 私人的公共index = 0;

@Override
    受保护的 无效的 onCreate(捆savedInstanceState) {
        超级.onCreate(savedInstanceState);

        // 全屏显示
        观点 装饰 = GetWindow().getDecorView();
装饰。setSystemUiVisibility(
View.SYSTEM_UI_FLAG_FULLSCREEN
|View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
|View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

提示=新的 TextView(这);
        setContentView(暗示);
        applyColor();
    }

    私人的 无效的 applyColor() {
        setContentView(暗示);
        观点 根 = GetWindow().getDecorView();
根。setBackgroundColor(颜色[指数]);
没有任何迹象.setBackgroundColor(颜色[指数]);
        布尔型 黑暗的=索引==4;
没有任何迹象.SetTextColor(深色？彩色.白色：彩色.黑色);
没有任何迹象.setText(姓名[指数] + "\n(点按屏幕切换 / 长按退出)");
没有任何迹象.setTextSize(20);
没有任何迹象.setGravity(android.view.Greavity.Center);
    }

@Override
    公共 布尔型 onTouchEvent(安卓.view.MotionEvent事件) {
        如果 (事件。getAction()==android.view.MotionEvent.ACTION_UP) {
索引=(指数+1)%colors.length；
            applyColor();
        }
返回正确；
    }

@Override
    公共 无效的 onBackPressed() {
        如果 (index==colors.length-1) {
            完成();
        } 其他 {
index=colors.length-1;
            applyColor();
        }
    }
}
