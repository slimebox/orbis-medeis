package org.femtobit.orbismedeis.client.screens.journal;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;
import org.femtobit.orbismedeis.OrbisMedeis;

public class JournalHomeScreen extends Screen {

    private static final int SCREEN_WIDTH = 181;
    private static final int SCREEN_HEIGHT = 151;

    private ResourceLocation ScreenTexture = new ResourceLocation(OrbisMedeis.ID, "textures/screen/journal_home.png");

    public JournalHomeScreen() {
        super(new TranslationTextComponent("screen.journal.home"));
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        // Draw bg texture
        this.minecraft.textureManager.bindTexture(ScreenTexture);
        this.blit(matrixStack, (this.width - SCREEN_WIDTH) / 2, (this.height - SCREEN_HEIGHT) / 2, 0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);

        int x = this.width;
        int y = this.height;

        //this.font.func_243246_a(matrixStack, new TranslationTextComponent("text.journal.home.title"), x, y, 0x00FFFFFF);
        this.font.renderString("hi darfer", this.width / 2, this.height / 2, 0xFFFFFFFF, false, null, null, false, 0xFFC6C6C6, 0);

        super.render(matrixStack, mouseX, mouseY, partialTicks);
    }

    @Override
    protected void init() {

    }

}
