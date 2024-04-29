package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.j0;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final int[] f1201b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<String> f1202c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f1203d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f1204e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1205f;

    /* renamed from: g  reason: collision with root package name */
    public final String f1206g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1207h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1208i;

    /* renamed from: j  reason: collision with root package name */
    public final CharSequence f1209j;

    /* renamed from: k  reason: collision with root package name */
    public final int f1210k;

    /* renamed from: l  reason: collision with root package name */
    public final CharSequence f1211l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<String> f1212m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList<String> f1213n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f1214o;

    public class a implements Parcelable.Creator<b> {
        public Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public Object[] newArray(int i2) {
            return new b[i2];
        }
    }

    public b(Parcel parcel) {
        this.f1201b = parcel.createIntArray();
        this.f1202c = parcel.createStringArrayList();
        this.f1203d = parcel.createIntArray();
        this.f1204e = parcel.createIntArray();
        this.f1205f = parcel.readInt();
        this.f1206g = parcel.readString();
        this.f1207h = parcel.readInt();
        this.f1208i = parcel.readInt();
        this.f1209j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1210k = parcel.readInt();
        this.f1211l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1212m = parcel.createStringArrayList();
        this.f1213n = parcel.createStringArrayList();
        this.f1214o = parcel.readInt() != 0;
    }

    public b(a aVar) {
        int size = aVar.f1326a.size();
        this.f1201b = new int[(size * 5)];
        if (aVar.f1332g) {
            this.f1202c = new ArrayList<>(size);
            this.f1203d = new int[size];
            this.f1204e = new int[size];
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                j0.a aVar2 = aVar.f1326a.get(i2);
                int i4 = i3 + 1;
                this.f1201b[i3] = aVar2.f1341a;
                ArrayList<String> arrayList = this.f1202c;
                n nVar = aVar2.f1342b;
                arrayList.add(nVar != null ? nVar.f1375f : null);
                int[] iArr = this.f1201b;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f1343c;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f1344d;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f1345e;
                iArr[i7] = aVar2.f1346f;
                this.f1203d[i2] = aVar2.f1347g.ordinal();
                this.f1204e[i2] = aVar2.f1348h.ordinal();
                i2++;
                i3 = i7 + 1;
            }
            this.f1205f = aVar.f1331f;
            this.f1206g = aVar.f1333h;
            this.f1207h = aVar.f1198r;
            this.f1208i = aVar.f1334i;
            this.f1209j = aVar.f1335j;
            this.f1210k = aVar.f1336k;
            this.f1211l = aVar.f1337l;
            this.f1212m = aVar.f1338m;
            this.f1213n = aVar.f1339n;
            this.f1214o = aVar.f1340o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f1201b);
        parcel.writeStringList(this.f1202c);
        parcel.writeIntArray(this.f1203d);
        parcel.writeIntArray(this.f1204e);
        parcel.writeInt(this.f1205f);
        parcel.writeString(this.f1206g);
        parcel.writeInt(this.f1207h);
        parcel.writeInt(this.f1208i);
        TextUtils.writeToParcel(this.f1209j, parcel, 0);
        parcel.writeInt(this.f1210k);
        TextUtils.writeToParcel(this.f1211l, parcel, 0);
        parcel.writeStringList(this.f1212m);
        parcel.writeStringList(this.f1213n);
        parcel.writeInt(this.f1214o ? 1 : 0);
    }
}
