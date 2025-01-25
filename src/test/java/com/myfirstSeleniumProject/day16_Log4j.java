package com.myfirstSeleniumProject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

public class day16_Log4j {

    /*
    1-Log4j kullnabilmek için gerekli olan dependencyleri pom.xml dosyamıza eklemeliyiz
    2-Resources dosyası oluşturarak bunu test resources root olarak işaretlemeli ve bu soya içinde bir tane log4j2.xml
    dosyasını oluştururuz ve içine gerekli konfigürasyon kodlarını koyarız
    3-Classımız içinde bir logger objesi oluşturmak ve bu obje üzerinden istediğimiz logları yapmak
     */

    @Test
    void test01() {

        Logger logger = LogManager.getLogger(day16_Log4j.class);

        logger.info("Techproeducation sayfasina gidildi");
        logger.info("Ana sayfada oldugu doğrulandi");
        logger.info("Sosyal medya iconlarinin görüntülendigi doğrulandi");

    }


}
