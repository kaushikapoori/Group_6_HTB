package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.o;
import com.example.supermarket.R;
import g0.u;
import o1.c;

public class CheckableImageButton extends o implements Checkable {

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f2480h = {16842912};

    /* renamed from: e  reason: collision with root package name */
    public boolean f2481e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2482f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2483g = true;

    public static class a extends l0.a {
        public static final Parcelable.Creator<a> CREATOR = new C0018a();

        /* renamed from: d  reason: collision with root package name */
        public boolean f2484d;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$a$a  reason: collision with other inner class name */
        public class C0018a implements Parcelable.ClassLoaderCreator<a> {
            public Object createFromParcel(Parcel parcel) {
                return new a(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i2) {
                return new a[i2];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2484d = parcel.readInt() != 1 ? false : true;
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f3321b, i2);
            parcel.writeInt(this.f2484d ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        u.u(this, new c(this));
    }

    public boolean isChecked() {
        return this.f2481e;
    }

    public int[] onCreateDrawableState(int i2) {
        if (!this.f2481e) {
            return super.onCreateDrawableState(i2);
        }
        int[] iArr = f2480h;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i2 + iArr.length), iArr);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f3321b);
        setChecked(aVar.f2484d);
    }

    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f2484d = this.f2481e;
        return aVar;
    }

    public void setCheckable(boolean z2) {
        if (this.f2482f != z2) {
            this.f2482f = z2;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z2) {
        if (this.f2482f && this.f2481e != z2) {
            this.f2481e = z2;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z2) {
        this.f2483g = z2;
    }

    public void setPressed(boolean z2) {
        if (this.f2483g) {
            super.setPressed(z2);
        }
    }

    public void toggle() {
        setChecked(!this.f2481e);
    }
}
