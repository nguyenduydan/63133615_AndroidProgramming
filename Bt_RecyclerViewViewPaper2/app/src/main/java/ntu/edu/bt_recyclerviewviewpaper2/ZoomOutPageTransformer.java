package ntu.edu.bt_recyclerviewviewpaper2;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;

public class ZoomOutPageTransformer implements ViewPager2.PageTransformer {
    private static final float MIN_SCALE = 0.85f;
    private static final float MIN_ALPHA = 0.5f;

    public void transformPage(@NonNull View page, float position) {
        int pageWidth = page.getWidth();
        int pageHeight = page.getHeight();

        if (position < -1) { // [-Infinity,-1)
            // Trang này nằm ngoài màn hình về bên trái..
            page.setAlpha(0f);

        } else if (position <= 1) { // [-1,1]
            //Sửa đổi chuyển tiếp slide mặc định để thu nhỏ trang.
            float scaleFactor = Math.max(MIN_SCALE, 1 - Math.abs(position));
            float vertMargin = pageHeight * (1 - scaleFactor) / 2;
            float horzMargin = pageWidth * (1 - scaleFactor) / 2;
            if (position < 0) {
                page.setTranslationX(horzMargin - vertMargin / 2);
            } else {
                page.setTranslationX(-horzMargin + vertMargin / 2);
            }

            // Thu nhỏ trang xuống (trong khoảng MIN_SCALE và 1).
            page.setScaleX(scaleFactor);
            page.setScaleY(scaleFactor);

            //Làm mờ trang tương ứng với kích thước của nó.
            page.setAlpha(MIN_ALPHA +
                    (scaleFactor - MIN_SCALE) /
                            (1 - MIN_SCALE) * (1 - MIN_ALPHA));

        } else { // (1,+Infinity]
            //Trang này nằm ngoài màn hình ở bên phải.
            page.setAlpha(0f);
        }
    }
}
