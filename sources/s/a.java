package s;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import h.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import n.g;
import org.xmlpull.v1.XmlPullParser;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3840a = false;

    /* renamed from: b  reason: collision with root package name */
    public String f3841b;

    /* renamed from: c  reason: collision with root package name */
    public int f3842c;

    /* renamed from: d  reason: collision with root package name */
    public int f3843d;

    /* renamed from: e  reason: collision with root package name */
    public float f3844e;

    /* renamed from: f  reason: collision with root package name */
    public String f3845f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3846g;

    /* renamed from: h  reason: collision with root package name */
    public int f3847h;

    public a(String str, int i2, Object obj, boolean z2) {
        this.f3841b = str;
        this.f3842c = i2;
        this.f3840a = z2;
        c(obj);
    }

    public a(a aVar, Object obj) {
        this.f3841b = aVar.f3841b;
        this.f3842c = aVar.f3842c;
        c(obj);
    }

    public static void a(Context context, XmlPullParser xmlPullParser, HashMap<String, a> hashMap) {
        int i2;
        float f2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.f3867e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        int i3 = 0;
        boolean z2 = false;
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            int i5 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z2 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i3 = 6;
            } else {
                if (index == 3) {
                    i5 = 3;
                } else if (index == 2) {
                    i5 = 4;
                } else {
                    if (index == 7) {
                        f2 = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == 4) {
                        f2 = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == 5) {
                        obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                        i3 = 2;
                    } else {
                        if (index == 6) {
                            i2 = obtainStyledAttributes.getInteger(index, -1);
                        } else if (index == 9) {
                            obj = obtainStyledAttributes.getString(index);
                            i3 = 5;
                        } else if (index == 8) {
                            i2 = obtainStyledAttributes.getResourceId(index, -1);
                            if (i2 == -1) {
                                i2 = obtainStyledAttributes.getInt(index, -1);
                            }
                            i5 = 8;
                        }
                        obj = Integer.valueOf(i2);
                        i3 = i5;
                    }
                    obj = Float.valueOf(f2);
                    i3 = 7;
                }
                i2 = obtainStyledAttributes.getColor(index, 0);
                obj = Integer.valueOf(i2);
                i3 = i5;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new a(str, i3, obj, z2));
        }
        obtainStyledAttributes.recycle();
    }

    public static void b(View view, HashMap<String, a> hashMap) {
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            a aVar = hashMap.get(next);
            String a2 = !aVar.f3840a ? f.a("set", next) : next;
            try {
                switch (g.a(aVar.f3842c)) {
                    case 0:
                        cls.getMethod(a2, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f3843d)});
                        break;
                    case 1:
                        cls.getMethod(a2, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f3844e)});
                        break;
                    case 2:
                        cls.getMethod(a2, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f3847h)});
                        break;
                    case 3:
                        Method method = cls.getMethod(a2, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f3847h);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 4:
                        cls.getMethod(a2, new Class[]{CharSequence.class}).invoke(view, new Object[]{aVar.f3845f});
                        break;
                    case 5:
                        cls.getMethod(a2, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(aVar.f3846g)});
                        break;
                    case 6:
                        cls.getMethod(a2, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f3844e)});
                        break;
                    case 7:
                        cls.getMethod(a2, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f3843d)});
                        break;
                }
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", e2.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(a2);
                Log.e("TransitionLayout", sb.toString());
            } catch (IllegalAccessException e3) {
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                e4.printStackTrace();
            }
        }
    }

    public void c(Object obj) {
        switch (g.a(this.f3842c)) {
            case 0:
            case 7:
                this.f3843d = ((Integer) obj).intValue();
                return;
            case 1:
            case 6:
                this.f3844e = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f3847h = ((Integer) obj).intValue();
                return;
            case 4:
                this.f3845f = (String) obj;
                return;
            case 5:
                this.f3846g = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}
