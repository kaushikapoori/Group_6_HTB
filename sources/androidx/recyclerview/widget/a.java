package androidx.recyclerview.widget;

import androidx.recyclerview.widget.q;
import java.util.ArrayList;
import java.util.List;
import n.e;

public class a implements q.a {

    /* renamed from: a  reason: collision with root package name */
    public e f1848a = new e(30, 1);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f1849b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f1850c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final C0012a f1851d;

    /* renamed from: e  reason: collision with root package name */
    public final q f1852e;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    public interface C0012a {
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1853a;

        /* renamed from: b  reason: collision with root package name */
        public int f1854b;

        /* renamed from: c  reason: collision with root package name */
        public Object f1855c;

        /* renamed from: d  reason: collision with root package name */
        public int f1856d;

        public b(int i2, int i3, int i4, Object obj) {
            this.f1853a = i2;
            this.f1854b = i3;
            this.f1856d = i4;
            this.f1855c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i2 = this.f1853a;
            if (i2 != bVar.f1853a) {
                return false;
            }
            if (i2 == 8 && Math.abs(this.f1856d - this.f1854b) == 1 && this.f1856d == bVar.f1854b && this.f1854b == bVar.f1856d) {
                return true;
            }
            if (this.f1856d != bVar.f1856d || this.f1854b != bVar.f1854b) {
                return false;
            }
            Object obj2 = this.f1855c;
            Object obj3 = bVar.f1855c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f1853a * 31) + this.f1854b) * 31) + this.f1856d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i2 = this.f1853a;
            sb.append(i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f1854b);
            sb.append("c:");
            sb.append(this.f1856d);
            sb.append(",p:");
            sb.append(this.f1855c);
            sb.append("]");
            return sb.toString();
        }
    }

    public a(C0012a aVar) {
        this.f1851d = aVar;
        this.f1852e = new q(this);
    }

    public final boolean a(int i2) {
        int size = this.f1850c.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.f1850c.get(i3);
            int i4 = bVar.f1853a;
            if (i4 == 8) {
                if (f(bVar.f1856d, i3 + 1) == i2) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = bVar.f1854b;
                int i6 = bVar.f1856d + i5;
                while (i5 < i6) {
                    if (f(i5, i3 + 1) == i2) {
                        return true;
                    }
                    i5++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void b() {
        int size = this.f1850c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((x) this.f1851d).a(this.f1850c.get(i2));
        }
        l(this.f1850c);
    }

    public void c() {
        b();
        int size = this.f1849b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f1849b.get(i2);
            int i3 = bVar.f1853a;
            if (i3 == 1) {
                ((x) this.f1851d).a(bVar);
                ((x) this.f1851d).d(bVar.f1854b, bVar.f1856d);
            } else if (i3 == 2) {
                ((x) this.f1851d).a(bVar);
                C0012a aVar = this.f1851d;
                int i4 = bVar.f1854b;
                int i5 = bVar.f1856d;
                x xVar = (x) aVar;
                xVar.f2002a.R(i4, i5, true);
                RecyclerView recyclerView = xVar.f2002a;
                recyclerView.f1665h0 = true;
                recyclerView.f1659e0.f1768c += i5;
            } else if (i3 == 4) {
                ((x) this.f1851d).a(bVar);
                ((x) this.f1851d).c(bVar.f1854b, bVar.f1856d, bVar.f1855c);
            } else if (i3 == 8) {
                ((x) this.f1851d).a(bVar);
                ((x) this.f1851d).e(bVar.f1854b, bVar.f1856d);
            }
        }
        l(this.f1849b);
    }

    public final void d(b bVar) {
        int i2;
        int i3 = bVar.f1853a;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m2 = m(bVar.f1854b, i3);
        int i4 = bVar.f1854b;
        int i5 = bVar.f1853a;
        if (i5 == 2) {
            i2 = 0;
        } else if (i5 == 4) {
            i2 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i6 = 1;
        for (int i7 = 1; i7 < bVar.f1856d; i7++) {
            int m3 = m((i2 * i7) + bVar.f1854b, bVar.f1853a);
            int i8 = bVar.f1853a;
            if (i8 == 2 ? m3 == m2 : i8 == 4 && m3 == m2 + 1) {
                i6++;
            } else {
                b h2 = h(i8, m2, i6, bVar.f1855c);
                e(h2, i4);
                h2.f1855c = null;
                this.f1848a.c(h2);
                if (bVar.f1853a == 4) {
                    i4 += i6;
                }
                m2 = m3;
                i6 = 1;
            }
        }
        Object obj = bVar.f1855c;
        bVar.f1855c = null;
        this.f1848a.c(bVar);
        if (i6 > 0) {
            b h3 = h(bVar.f1853a, m2, i6, obj);
            e(h3, i4);
            h3.f1855c = null;
            this.f1848a.c(h3);
        }
    }

    public void e(b bVar, int i2) {
        ((x) this.f1851d).a(bVar);
        int i3 = bVar.f1853a;
        if (i3 == 2) {
            C0012a aVar = this.f1851d;
            int i4 = bVar.f1856d;
            x xVar = (x) aVar;
            xVar.f2002a.R(i2, i4, true);
            RecyclerView recyclerView = xVar.f2002a;
            recyclerView.f1665h0 = true;
            recyclerView.f1659e0.f1768c += i4;
        } else if (i3 == 4) {
            ((x) this.f1851d).c(i2, bVar.f1856d, bVar.f1855c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public int f(int i2, int i3) {
        int size = this.f1850c.size();
        while (i3 < size) {
            b bVar = this.f1850c.get(i3);
            int i4 = bVar.f1853a;
            if (i4 == 8) {
                int i5 = bVar.f1854b;
                if (i5 == i2) {
                    i2 = bVar.f1856d;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (bVar.f1856d <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = bVar.f1854b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = bVar.f1856d;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += bVar.f1856d;
                }
            }
            i3++;
        }
        return i2;
    }

    public boolean g() {
        return this.f1849b.size() > 0;
    }

    public b h(int i2, int i3, int i4, Object obj) {
        b bVar = (b) this.f1848a.a();
        if (bVar == null) {
            return new b(i2, i3, i4, obj);
        }
        bVar.f1853a = i2;
        bVar.f1854b = i3;
        bVar.f1856d = i4;
        bVar.f1855c = obj;
        return bVar;
    }

    public final void i(b bVar) {
        this.f1850c.add(bVar);
        int i2 = bVar.f1853a;
        if (i2 == 1) {
            ((x) this.f1851d).d(bVar.f1854b, bVar.f1856d);
        } else if (i2 == 2) {
            C0012a aVar = this.f1851d;
            x xVar = (x) aVar;
            xVar.f2002a.R(bVar.f1854b, bVar.f1856d, false);
            xVar.f2002a.f1665h0 = true;
        } else if (i2 == 4) {
            ((x) this.f1851d).c(bVar.f1854b, bVar.f1856d, bVar.f1855c);
        } else if (i2 == 8) {
            ((x) this.f1851d).e(bVar.f1854b, bVar.f1856d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0165, code lost:
        if (r5 > r12.f1854b) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x018f, code lost:
        if (r5 >= r12.f1854b) goto L_0x0191;
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j() {
        /*
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.q r1 = r0.f1852e
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r2 = r0.f1849b
            java.util.Objects.requireNonNull(r1)
        L_0x0009:
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x0010:
            r7 = 8
            r8 = -1
            if (r3 < 0) goto L_0x0026
            java.lang.Object r9 = r2.get(r3)
            androidx.recyclerview.widget.a$b r9 = (androidx.recyclerview.widget.a.b) r9
            int r9 = r9.f1853a
            if (r9 != r7) goto L_0x0022
            if (r6 == 0) goto L_0x0023
            goto L_0x0027
        L_0x0022:
            r6 = 1
        L_0x0023:
            int r3 = r3 + -1
            goto L_0x0010
        L_0x0026:
            r3 = -1
        L_0x0027:
            r6 = 4
            r9 = 2
            r10 = 0
            if (r3 == r8) goto L_0x01d7
            int r7 = r3 + 1
            java.lang.Object r11 = r2.get(r3)
            androidx.recyclerview.widget.a$b r11 = (androidx.recyclerview.widget.a.b) r11
            java.lang.Object r12 = r2.get(r7)
            androidx.recyclerview.widget.a$b r12 = (androidx.recyclerview.widget.a.b) r12
            int r13 = r12.f1853a
            if (r13 == r4) goto L_0x01ad
            if (r13 == r9) goto L_0x00b1
            if (r13 == r6) goto L_0x0043
            goto L_0x0009
        L_0x0043:
            int r5 = r11.f1856d
            int r8 = r12.f1854b
            if (r5 >= r8) goto L_0x004e
            int r8 = r8 + -1
            r12.f1854b = r8
            goto L_0x0064
        L_0x004e:
            int r9 = r12.f1856d
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x0064
            int r9 = r9 + -1
            r12.f1856d = r9
            androidx.recyclerview.widget.q$a r5 = r1.f1994a
            int r8 = r11.f1854b
            java.lang.Object r9 = r12.f1855c
            androidx.recyclerview.widget.a r5 = (androidx.recyclerview.widget.a) r5
            androidx.recyclerview.widget.a$b r4 = r5.h(r6, r8, r4, r9)
            goto L_0x0065
        L_0x0064:
            r4 = r10
        L_0x0065:
            int r5 = r11.f1854b
            int r8 = r12.f1854b
            if (r5 > r8) goto L_0x0070
            int r8 = r8 + 1
            r12.f1854b = r8
            goto L_0x0088
        L_0x0070:
            int r9 = r12.f1856d
            int r8 = r8 + r9
            if (r5 >= r8) goto L_0x0088
            int r8 = r8 - r5
            androidx.recyclerview.widget.q$a r9 = r1.f1994a
            int r5 = r5 + 1
            java.lang.Object r13 = r12.f1855c
            androidx.recyclerview.widget.a r9 = (androidx.recyclerview.widget.a) r9
            androidx.recyclerview.widget.a$b r5 = r9.h(r6, r5, r8, r13)
            int r6 = r12.f1856d
            int r6 = r6 - r8
            r12.f1856d = r6
            goto L_0x0089
        L_0x0088:
            r5 = r10
        L_0x0089:
            r2.set(r7, r11)
            int r6 = r12.f1856d
            if (r6 <= 0) goto L_0x0094
            r2.set(r3, r12)
            goto L_0x00a5
        L_0x0094:
            r2.remove(r3)
            androidx.recyclerview.widget.q$a r6 = r1.f1994a
            androidx.recyclerview.widget.a r6 = (androidx.recyclerview.widget.a) r6
            java.util.Objects.requireNonNull(r6)
            r12.f1855c = r10
            n.e r6 = r6.f1848a
            r6.c(r12)
        L_0x00a5:
            if (r4 == 0) goto L_0x00aa
            r2.add(r3, r4)
        L_0x00aa:
            if (r5 == 0) goto L_0x0009
            r2.add(r3, r5)
            goto L_0x0009
        L_0x00b1:
            int r6 = r11.f1854b
            int r8 = r11.f1856d
            int r13 = r12.f1854b
            if (r6 >= r8) goto L_0x00c6
            if (r13 != r6) goto L_0x00c3
            int r14 = r12.f1856d
            int r6 = r8 - r6
            if (r14 != r6) goto L_0x00c3
            r5 = 0
            goto L_0x00d0
        L_0x00c3:
            r5 = 0
            r6 = 0
            goto L_0x00d5
        L_0x00c6:
            int r14 = r8 + 1
            if (r13 != r14) goto L_0x00d3
            int r14 = r12.f1856d
            int r6 = r6 - r8
            if (r14 != r6) goto L_0x00d3
            r5 = 1
        L_0x00d0:
            r6 = r5
            r5 = 1
            goto L_0x00d5
        L_0x00d3:
            r5 = 0
            r6 = 1
        L_0x00d5:
            if (r8 >= r13) goto L_0x00dc
            int r13 = r13 + -1
            r12.f1854b = r13
            goto L_0x0100
        L_0x00dc:
            int r14 = r12.f1856d
            int r13 = r13 + r14
            if (r8 >= r13) goto L_0x0100
            int r14 = r14 + -1
            r12.f1856d = r14
            r11.f1853a = r9
            r11.f1856d = r4
            int r3 = r12.f1856d
            if (r3 != 0) goto L_0x0009
            r2.remove(r7)
            androidx.recyclerview.widget.q$a r3 = r1.f1994a
            androidx.recyclerview.widget.a r3 = (androidx.recyclerview.widget.a) r3
            java.util.Objects.requireNonNull(r3)
            r12.f1855c = r10
            n.e r3 = r3.f1848a
            r3.c(r12)
            goto L_0x0009
        L_0x0100:
            int r4 = r11.f1854b
            int r8 = r12.f1854b
            if (r4 > r8) goto L_0x010b
            int r8 = r8 + 1
            r12.f1854b = r8
            goto L_0x0123
        L_0x010b:
            int r13 = r12.f1856d
            int r8 = r8 + r13
            if (r4 >= r8) goto L_0x0123
            int r8 = r8 - r4
            androidx.recyclerview.widget.q$a r13 = r1.f1994a
            int r4 = r4 + 1
            androidx.recyclerview.widget.a r13 = (androidx.recyclerview.widget.a) r13
            androidx.recyclerview.widget.a$b r4 = r13.h(r9, r4, r8, r10)
            int r8 = r11.f1854b
            int r9 = r12.f1854b
            int r8 = r8 - r9
            r12.f1856d = r8
            goto L_0x0124
        L_0x0123:
            r4 = r10
        L_0x0124:
            if (r5 == 0) goto L_0x013c
            r2.set(r3, r12)
            r2.remove(r7)
            androidx.recyclerview.widget.q$a r3 = r1.f1994a
            androidx.recyclerview.widget.a r3 = (androidx.recyclerview.widget.a) r3
            java.util.Objects.requireNonNull(r3)
            r11.f1855c = r10
            n.e r3 = r3.f1848a
            r3.c(r11)
            goto L_0x0009
        L_0x013c:
            if (r6 == 0) goto L_0x0168
            if (r4 == 0) goto L_0x0156
            int r5 = r11.f1854b
            int r6 = r4.f1854b
            if (r5 <= r6) goto L_0x014b
            int r6 = r4.f1856d
            int r5 = r5 - r6
            r11.f1854b = r5
        L_0x014b:
            int r5 = r11.f1856d
            int r6 = r4.f1854b
            if (r5 <= r6) goto L_0x0156
            int r6 = r4.f1856d
            int r5 = r5 - r6
            r11.f1856d = r5
        L_0x0156:
            int r5 = r11.f1854b
            int r6 = r12.f1854b
            if (r5 <= r6) goto L_0x0161
            int r6 = r12.f1856d
            int r5 = r5 - r6
            r11.f1854b = r5
        L_0x0161:
            int r5 = r11.f1856d
            int r6 = r12.f1854b
            if (r5 <= r6) goto L_0x0196
            goto L_0x0191
        L_0x0168:
            if (r4 == 0) goto L_0x0180
            int r5 = r11.f1854b
            int r6 = r4.f1854b
            if (r5 < r6) goto L_0x0175
            int r6 = r4.f1856d
            int r5 = r5 - r6
            r11.f1854b = r5
        L_0x0175:
            int r5 = r11.f1856d
            int r6 = r4.f1854b
            if (r5 < r6) goto L_0x0180
            int r6 = r4.f1856d
            int r5 = r5 - r6
            r11.f1856d = r5
        L_0x0180:
            int r5 = r11.f1854b
            int r6 = r12.f1854b
            if (r5 < r6) goto L_0x018b
            int r6 = r12.f1856d
            int r5 = r5 - r6
            r11.f1854b = r5
        L_0x018b:
            int r5 = r11.f1856d
            int r6 = r12.f1854b
            if (r5 < r6) goto L_0x0196
        L_0x0191:
            int r6 = r12.f1856d
            int r5 = r5 - r6
            r11.f1856d = r5
        L_0x0196:
            r2.set(r3, r12)
            int r5 = r11.f1854b
            int r6 = r11.f1856d
            if (r5 == r6) goto L_0x01a3
            r2.set(r7, r11)
            goto L_0x01a6
        L_0x01a3:
            r2.remove(r7)
        L_0x01a6:
            if (r4 == 0) goto L_0x0009
            r2.add(r3, r4)
            goto L_0x0009
        L_0x01ad:
            int r4 = r11.f1856d
            int r6 = r12.f1854b
            if (r4 >= r6) goto L_0x01b5
            r5 = -1
            goto L_0x01b6
        L_0x01b5:
            r5 = 0
        L_0x01b6:
            int r8 = r11.f1854b
            if (r8 >= r6) goto L_0x01bc
            int r5 = r5 + 1
        L_0x01bc:
            if (r6 > r8) goto L_0x01c3
            int r6 = r12.f1856d
            int r8 = r8 + r6
            r11.f1854b = r8
        L_0x01c3:
            int r6 = r12.f1854b
            if (r6 > r4) goto L_0x01cc
            int r8 = r12.f1856d
            int r4 = r4 + r8
            r11.f1856d = r4
        L_0x01cc:
            int r6 = r6 + r5
            r12.f1854b = r6
            r2.set(r3, r12)
            r2.set(r7, r11)
            goto L_0x0009
        L_0x01d7:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f1849b
            int r1 = r1.size()
            r2 = 0
        L_0x01de:
            if (r2 >= r1) goto L_0x02b2
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f1849b
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.a.b) r3
            int r11 = r3.f1853a
            if (r11 == r4) goto L_0x02ab
            if (r11 == r9) goto L_0x0251
            if (r11 == r6) goto L_0x01f9
            if (r11 == r7) goto L_0x01f4
            goto L_0x02ae
        L_0x01f4:
            r0.i(r3)
            goto L_0x02ae
        L_0x01f9:
            int r11 = r3.f1854b
            int r12 = r3.f1856d
            int r12 = r12 + r11
            r13 = r11
            r14 = 0
            r15 = -1
        L_0x0201:
            if (r11 >= r12) goto L_0x0235
            androidx.recyclerview.widget.a$a r5 = r0.f1851d
            androidx.recyclerview.widget.x r5 = (androidx.recyclerview.widget.x) r5
            androidx.recyclerview.widget.RecyclerView$z r5 = r5.b(r11)
            if (r5 != 0) goto L_0x0223
            boolean r5 = r0.a(r11)
            if (r5 == 0) goto L_0x0214
            goto L_0x0223
        L_0x0214:
            if (r15 != r4) goto L_0x0221
            java.lang.Object r5 = r3.f1855c
            androidx.recyclerview.widget.a$b r5 = r0.h(r6, r13, r14, r5)
            r0.i(r5)
            r13 = r11
            r14 = 0
        L_0x0221:
            r15 = 0
            goto L_0x0231
        L_0x0223:
            if (r15 != 0) goto L_0x0230
            java.lang.Object r5 = r3.f1855c
            androidx.recyclerview.widget.a$b r5 = r0.h(r6, r13, r14, r5)
            r0.d(r5)
            r13 = r11
            r14 = 0
        L_0x0230:
            r15 = 1
        L_0x0231:
            int r14 = r14 + r4
            int r11 = r11 + 1
            goto L_0x0201
        L_0x0235:
            int r5 = r3.f1856d
            if (r14 == r5) goto L_0x0246
            java.lang.Object r5 = r3.f1855c
            r3.f1855c = r10
            n.e r11 = r0.f1848a
            r11.c(r3)
            androidx.recyclerview.widget.a$b r3 = r0.h(r6, r13, r14, r5)
        L_0x0246:
            if (r15 != 0) goto L_0x024d
            r0.d(r3)
            goto L_0x02ae
        L_0x024d:
            r0.i(r3)
            goto L_0x02ae
        L_0x0251:
            int r5 = r3.f1854b
            int r11 = r3.f1856d
            int r11 = r11 + r5
            r12 = r5
            r13 = 0
            r14 = -1
        L_0x0259:
            if (r12 >= r11) goto L_0x0292
            androidx.recyclerview.widget.a$a r15 = r0.f1851d
            androidx.recyclerview.widget.x r15 = (androidx.recyclerview.widget.x) r15
            androidx.recyclerview.widget.RecyclerView$z r15 = r15.b(r12)
            if (r15 != 0) goto L_0x027a
            boolean r15 = r0.a(r12)
            if (r15 == 0) goto L_0x026c
            goto L_0x027a
        L_0x026c:
            if (r14 != r4) goto L_0x0277
            androidx.recyclerview.widget.a$b r14 = r0.h(r9, r5, r13, r10)
            r0.i(r14)
            r14 = 1
            goto L_0x0278
        L_0x0277:
            r14 = 0
        L_0x0278:
            r15 = 0
            goto L_0x0287
        L_0x027a:
            if (r14 != 0) goto L_0x0285
            androidx.recyclerview.widget.a$b r14 = r0.h(r9, r5, r13, r10)
            r0.d(r14)
            r14 = 1
            goto L_0x0286
        L_0x0285:
            r14 = 0
        L_0x0286:
            r15 = 1
        L_0x0287:
            if (r14 == 0) goto L_0x028d
            int r12 = r12 - r13
            int r11 = r11 - r13
            r13 = 1
            goto L_0x028f
        L_0x028d:
            int r13 = r13 + 1
        L_0x028f:
            int r12 = r12 + r4
            r14 = r15
            goto L_0x0259
        L_0x0292:
            int r11 = r3.f1856d
            if (r13 == r11) goto L_0x02a1
            r3.f1855c = r10
            n.e r11 = r0.f1848a
            r11.c(r3)
            androidx.recyclerview.widget.a$b r3 = r0.h(r9, r5, r13, r10)
        L_0x02a1:
            if (r14 != 0) goto L_0x02a7
            r0.d(r3)
            goto L_0x02ae
        L_0x02a7:
            r0.i(r3)
            goto L_0x02ae
        L_0x02ab:
            r0.i(r3)
        L_0x02ae:
            int r2 = r2 + 1
            goto L_0x01de
        L_0x02b2:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f1849b
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.j():void");
    }

    public void k(b bVar) {
        bVar.f1855c = null;
        this.f1848a.c(bVar);
    }

    public void l(List<b> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            k(list.get(i2));
        }
        list.clear();
    }

    public final int m(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        for (int size = this.f1850c.size() - 1; size >= 0; size--) {
            b bVar = this.f1850c.get(size);
            int i10 = bVar.f1853a;
            if (i10 == 8) {
                int i11 = bVar.f1854b;
                int i12 = bVar.f1856d;
                if (i11 < i12) {
                    i6 = i11;
                    i5 = i12;
                } else {
                    i5 = i11;
                    i6 = i12;
                }
                if (i2 < i6 || i2 > i5) {
                    if (i2 < i11) {
                        if (i3 == 1) {
                            bVar.f1854b = i11 + 1;
                            i7 = i12 + 1;
                        } else if (i3 == 2) {
                            bVar.f1854b = i11 - 1;
                            i7 = i12 - 1;
                        }
                        bVar.f1856d = i7;
                    }
                } else if (i6 == i11) {
                    if (i3 == 1) {
                        i9 = i12 + 1;
                    } else {
                        if (i3 == 2) {
                            i9 = i12 - 1;
                        }
                        i2++;
                    }
                    bVar.f1856d = i9;
                    i2++;
                } else {
                    if (i3 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i3 == 2) {
                            i8 = i11 - 1;
                        }
                        i2--;
                    }
                    bVar.f1854b = i8;
                    i2--;
                }
            } else {
                int i13 = bVar.f1854b;
                if (i13 > i2) {
                    if (i3 == 1) {
                        i4 = i13 + 1;
                    } else if (i3 == 2) {
                        i4 = i13 - 1;
                    }
                    bVar.f1854b = i4;
                } else if (i10 == 1) {
                    i2 -= bVar.f1856d;
                } else if (i10 == 2) {
                    i2 += bVar.f1856d;
                }
            }
        }
        for (int size2 = this.f1850c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f1850c.get(size2);
            if (bVar2.f1853a == 8) {
                int i14 = bVar2.f1856d;
                if (i14 != bVar2.f1854b && i14 >= 0) {
                }
            } else if (bVar2.f1856d > 0) {
            }
            this.f1850c.remove(size2);
            bVar2.f1855c = null;
            this.f1848a.c(bVar2);
        }
        return i2;
    }
}
