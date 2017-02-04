package kwl.automate.pages.data.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateUtil {

    // random integer number generator in range [b, a]
    public String getCurrentDate() {

        return String.valueOf(new SimpleDateFormat("dd.MM.yyyy").format(new Date()));
    }
}
