package g1;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.a;

public class b extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Chip f3090a;

    public b(Chip chip) {
        this.f3090a = chip;
    }

    @TargetApi(21)
    public void getOutline(View view, Outline outline) {
        a aVar = this.f3090a.f2242f;
        if (aVar != null) {
            aVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
