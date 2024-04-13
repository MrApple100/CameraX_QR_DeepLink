package com.example.camerax_qr_deeplink;

public interface QRCodeListener {
    public void onQRFound(String qrcode);
    public void onQRNotFound();
}
