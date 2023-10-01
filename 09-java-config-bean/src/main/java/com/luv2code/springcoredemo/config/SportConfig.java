package com.luv2code.springcoredemo.config;

import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.SwimCoach;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// لمى ضفنا الصف swimCoach  ضمن البكج اللي فيها الكلاسات بدون annotation ماشفو وضرب خطأ
// لهيك بطريقة تانيه عرفنا بكج جديدة وحطينا فيا كلاس جديد
// وحطينا @Configuration لحتى يفهم السبرينغ انو هي الكلاس خارجي ولازم يستخدمو
// بالتالي منعرف طريقة بترد instancre نسخه من الصف ومنحط فوقا @Bean
// @Bean  بيفهم انو هي الصف منوصلو من هي الاجرائية
// اهم شي اسم الاجرائية باسم الصف وبترد نيو من الصف
//
//
//فينا نوصلا من خلال  الdemoControoler مباشرة
// بس بحط لهي @Bean اسم بيكون هوي الid
//وبحطا بال@Qualifier محل اسم الكلاس

public class SportConfig {

    // @Bean // الطريقة الاولى
    @Bean("swimBean") // الطريقة التانيه بستخدما بالكونترول محل اسم الكلاس بعد انونتيشن Quailfier
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
