package x0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import m.a;

public class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f4302d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f4303e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4304f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4305g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4306h;

    /* renamed from: i  reason: collision with root package name */
    public int f4307i;

    /* renamed from: j  reason: collision with root package name */
    public int f4308j;

    /* renamed from: k  reason: collision with root package name */
    public int f4309k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a(), new a(), new a());
    }

    public b(Parcel parcel, int i2, int i3, String str, a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f4302d = new SparseIntArray();
        this.f4307i = -1;
        this.f4308j = 0;
        this.f4309k = -1;
        this.f4303e = parcel;
        this.f4304f = i2;
        this.f4305g = i3;
        this.f4308j = i2;
        this.f4306h = str;
    }

    public void a() {
        int i2 = this.f4307i;
        if (i2 >= 0) {
            int i3 = this.f4302d.get(i2);
            int dataPosition = this.f4303e.dataPosition();
            this.f4303e.setDataPosition(i3);
            this.f4303e.writeInt(dataPosition - i3);
            this.f4303e.setDataPosition(dataPosition);
        }
    }

    public a b() {
        Parcel parcel = this.f4303e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f4308j;
        if (i2 == this.f4304f) {
            i2 = this.f4305g;
        }
        int i3 = i2;
        return new b(parcel, dataPosition, i3, this.f4306h + "  ", this.f4299a, this.f4300b, this.f4301c);
    }

    public boolean f() {
        return this.f4303e.readInt() != 0;
    }

    public byte[] g() {
        int readInt = this.f4303e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f4303e.readByteArray(bArr);
        return bArr;
    }

    public CharSequence h() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4303e);
    }

    public boolean i(int i2) {
        while (this.f4308j < this.f4305g) {
            int i3 = this.f4309k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f4303e.setDataPosition(this.f4308j);
            int readInt = this.f4303e.readInt();
            this.f4309k = this.f4303e.readInt();
            this.f4308j += readInt;
        }
        return this.f4309k == i2;
    }

    public int j() {
        return this.f4303e.readInt();
    }

    public <T extends Parcelable> T l() {
        return this.f4303e.readParcelable(b.class.getClassLoader());
    }

    public String n() {
        return this.f4303e.readString();
    }

    public void p(int i2) {
        a();
        this.f4307i = i2;
        this.f4302d.put(i2, this.f4303e.dataPosition());
        this.f4303e.writeInt(0);
        this.f4303e.writeInt(i2);
    }

    public void q(boolean z2) {
        this.f4303e.writeInt(z2 ? 1 : 0);
    }

    public void r(byte[] bArr) {
        if (bArr != null) {
            this.f4303e.writeInt(bArr.length);
            this.f4303e.writeByteArray(bArr);
            return;
        }
        this.f4303e.writeInt(-1);
    }

    public void s(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4303e, 0);
    }

    public void t(int i2) {
        this.f4303e.writeInt(i2);
    }

    public void u(Parcelable parcelable) {
        this.f4303e.writeParcelable(parcelable, 0);
    }

    public void v(String str) {
        this.f4303e.writeString(str);
    }
}
