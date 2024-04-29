package e0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;

public class b implements Spannable {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f2913a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f2914b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2915c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2916d;

        public a(PrecomputedText.Params params) {
            this.f2913a = params.getTextPaint();
            this.f2914b = params.getTextDirection();
            this.f2915c = params.getBreakStrategy();
            this.f2916d = params.getHyphenationFrequency();
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
            }
            this.f2913a = textPaint;
            this.f2914b = textDirectionHeuristic;
            this.f2915c = i2;
            this.f2916d = i3;
        }

        public boolean a(a aVar) {
            int i2 = Build.VERSION.SDK_INT;
            if ((i2 >= 23 && (this.f2915c != aVar.f2915c || this.f2916d != aVar.f2916d)) || this.f2913a.getTextSize() != aVar.f2913a.getTextSize() || this.f2913a.getTextScaleX() != aVar.f2913a.getTextScaleX() || this.f2913a.getTextSkewX() != aVar.f2913a.getTextSkewX() || this.f2913a.getLetterSpacing() != aVar.f2913a.getLetterSpacing() || !TextUtils.equals(this.f2913a.getFontFeatureSettings(), aVar.f2913a.getFontFeatureSettings()) || this.f2913a.getFlags() != aVar.f2913a.getFlags()) {
                return false;
            }
            if (i2 >= 24) {
                if (!this.f2913a.getTextLocales().equals(aVar.f2913a.getTextLocales())) {
                    return false;
                }
            } else if (!this.f2913a.getTextLocale().equals(aVar.f2913a.getTextLocale())) {
                return false;
            }
            if (this.f2913a.getTypeface() == null) {
                if (aVar.f2913a.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f2913a.getTypeface().equals(aVar.f2913a.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f2914b == aVar.f2914b;
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return Objects.hash(new Object[]{Float.valueOf(this.f2913a.getTextSize()), Float.valueOf(this.f2913a.getTextScaleX()), Float.valueOf(this.f2913a.getTextSkewX()), Float.valueOf(this.f2913a.getLetterSpacing()), Integer.valueOf(this.f2913a.getFlags()), this.f2913a.getTextLocales(), this.f2913a.getTypeface(), Boolean.valueOf(this.f2913a.isElegantTextHeight()), this.f2914b, Integer.valueOf(this.f2915c), Integer.valueOf(this.f2916d)});
            }
            return Objects.hash(new Object[]{Float.valueOf(this.f2913a.getTextSize()), Float.valueOf(this.f2913a.getTextScaleX()), Float.valueOf(this.f2913a.getTextSkewX()), Float.valueOf(this.f2913a.getLetterSpacing()), Integer.valueOf(this.f2913a.getFlags()), this.f2913a.getTextLocale(), this.f2913a.getTypeface(), Boolean.valueOf(this.f2913a.isElegantTextHeight()), this.f2914b, Integer.valueOf(this.f2915c), Integer.valueOf(this.f2916d)});
        }

        public String toString() {
            Object obj;
            StringBuilder sb;
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder a2 = androidx.activity.result.a.a("textSize=");
            a2.append(this.f2913a.getTextSize());
            sb2.append(a2.toString());
            sb2.append(", textScaleX=" + this.f2913a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f2913a.getTextSkewX());
            int i2 = Build.VERSION.SDK_INT;
            StringBuilder a3 = androidx.activity.result.a.a(", letterSpacing=");
            a3.append(this.f2913a.getLetterSpacing());
            sb2.append(a3.toString());
            sb2.append(", elegantTextHeight=" + this.f2913a.isElegantTextHeight());
            if (i2 >= 24) {
                sb = androidx.activity.result.a.a(", textLocale=");
                obj = this.f2913a.getTextLocales();
            } else {
                sb = androidx.activity.result.a.a(", textLocale=");
                obj = this.f2913a.getTextLocale();
            }
            sb.append(obj);
            sb2.append(sb.toString());
            StringBuilder a4 = androidx.activity.result.a.a(", typeface=");
            a4.append(this.f2913a.getTypeface());
            sb2.append(a4.toString());
            if (i2 >= 26) {
                StringBuilder a5 = androidx.activity.result.a.a(", variationSettings=");
                a5.append(this.f2913a.getFontVariationSettings());
                sb2.append(a5.toString());
            }
            StringBuilder a6 = androidx.activity.result.a.a(", textDir=");
            a6.append(this.f2914b);
            sb2.append(a6.toString());
            sb2.append(", breakStrategy=" + this.f2915c);
            sb2.append(", hyphenationFrequency=" + this.f2916d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    public char charAt(int i2) {
        throw null;
    }

    public int getSpanEnd(Object obj) {
        throw null;
    }

    public int getSpanFlags(Object obj) {
        throw null;
    }

    public int getSpanStart(Object obj) {
        throw null;
    }

    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        int i4 = Build.VERSION.SDK_INT;
        throw null;
    }

    public int length() {
        throw null;
    }

    public int nextSpanTransition(int i2, int i3, Class cls) {
        throw null;
    }

    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            int i2 = Build.VERSION.SDK_INT;
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (!(obj instanceof MetricAffectingSpan)) {
            int i5 = Build.VERSION.SDK_INT;
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    public CharSequence subSequence(int i2, int i3) {
        throw null;
    }

    public String toString() {
        throw null;
    }
}
