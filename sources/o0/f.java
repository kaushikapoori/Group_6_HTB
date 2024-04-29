package o0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.d;
import java.util.Objects;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final b f3506a;

    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f3507a;

        /* renamed from: b  reason: collision with root package name */
        public final d f3508b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3509c = true;

        public a(TextView textView) {
            this.f3507a = textView;
            this.f3508b = new d(textView);
        }

        public InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f3509c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                    if (inputFilterArr[i2] instanceof d) {
                        sparseArray.put(i2, inputFilterArr[i2]);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - sparseArray.size())];
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    if (sparseArray.indexOfKey(i4) < 0) {
                        inputFilterArr2[i3] = inputFilterArr[i4];
                        i3++;
                    }
                }
                return inputFilterArr2;
            }
            for (d dVar : inputFilterArr) {
                if (dVar == this.f3508b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr3 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, r0);
            inputFilterArr3[r0] = this.f3508b;
            return inputFilterArr3;
        }

        public void b(boolean z2) {
            if (z2) {
                d();
            }
        }

        public void c(boolean z2) {
            this.f3509c = z2;
            d();
            this.f3507a.setFilters(a(this.f3507a.getFilters()));
        }

        public void d() {
            TransformationMethod transformationMethod = this.f3507a.getTransformationMethod();
            if (this.f3509c) {
                if (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                    transformationMethod = new h(transformationMethod);
                }
            } else if (transformationMethod instanceof h) {
                transformationMethod = ((h) transformationMethod).f3516b;
            }
            this.f3507a.setTransformationMethod(transformationMethod);
        }
    }

    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public void b(boolean z2) {
            throw null;
        }

        public void c(boolean z2) {
            throw null;
        }
    }

    public static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final a f3510a;

        public c(TextView textView) {
            this.f3510a = new a(textView);
        }

        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return d() ? inputFilterArr : this.f3510a.a(inputFilterArr);
        }

        public void b(boolean z2) {
            if (!d()) {
                a aVar = this.f3510a;
                Objects.requireNonNull(aVar);
                if (z2) {
                    aVar.d();
                }
            }
        }

        public void c(boolean z2) {
            if (d()) {
                this.f3510a.f3509c = z2;
                return;
            }
            a aVar = this.f3510a;
            aVar.f3509c = z2;
            aVar.d();
            aVar.f3507a.setFilters(aVar.a(aVar.f3507a.getFilters()));
        }

        public final boolean d() {
            return !d.c();
        }
    }

    public f(TextView textView, boolean z2) {
        c.a.d(textView, "textView cannot be null");
        this.f3506a = !z2 ? new c(textView) : new a(textView);
    }
}
