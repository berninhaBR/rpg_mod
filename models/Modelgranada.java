// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelgranada extends EntityModel<Entity> {
	private final ModelRenderer tudo;

	public Modelgranada() {
		textureWidth = 32;
		textureHeight = 32;

		tudo = new ModelRenderer(this);
		tudo.setRotationPoint(0.0F, 16.0F, 2.0F);
		tudo.setTextureOffset(6, 0).addBox(-0.05F, 1.6F, -2.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);
		tudo.setTextureOffset(0, 6).addBox(-0.05F, 0.6F, -2.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		tudo.setTextureOffset(0, 0).addBox(0.9F, 0.6F, -2.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		tudo.setTextureOffset(0, 7).addBox(-1.6F, 3.0F, -2.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);
		tudo.setTextureOffset(0, 0).addBox(-1.0F, 3.0F, -2.6F, 2.0F, 4.0F, 3.0F, 0.0F, false);
		tudo.setTextureOffset(10, 10).addBox(-1.0F, 2.4F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		tudo.setTextureOffset(0, 0).addBox(-0.1F, 0.6F, -2.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		tudo.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}