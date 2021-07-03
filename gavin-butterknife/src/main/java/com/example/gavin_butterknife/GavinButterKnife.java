package com.example.gavin_butterknife;

import android.app.Activity;

import com.example.gavin_butterknife_annotation.Constant;
import com.example.gavin_butterknife_annotation.GavinViewBinder;

/**
 * @Author: Gavin
 * @CreateDate: 7/3/21 12:35 AM
 * @Description:
 */
public class GavinButterKnife {
    public static void bind(Activity activity) {
//       动态类加载
        try {
            Class<?> obj = Class.forName(activity.getClass().getName() + Constant.CODE_CLASS_EXT_NAME);
            GavinViewBinder viewBinder = (GavinViewBinder) obj.newInstance();
            viewBinder.bind(activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
