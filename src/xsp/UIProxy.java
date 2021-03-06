package xsp;

import java.awt.image.BufferedImage;

/**
 * @author m1kc
 */
public interface UIProxy {

    // Ошибки

    public void errorWhileSending(Throwable ex);

    // Обработка пакетов

    public void packReceived(int type, int subtype, String[] utf, byte[] bytes);

    public void packetSent(int type, int subtype, String[] utf, byte[] bytes);

    // Обработка ошибочных пакетов

    public void errorUnknownType(int type, int subtype);

    // Обработка пакетов

    public void handleService(int subtype, String[] body, byte[] bytes);

    public void handlePing(int subtype, String[] s, byte[] bytes);

    public void handleCapsCheck(int subtype, String[] body, byte[] bytes);

    public void handleMessage(int subtype, String[] s, byte[] bytes);

    public void handleTerminal(int subtype, String[] body, byte[] bytes);

    public void handleFile(int subtype, String[] body, byte[] bytes);

    public void handleMicrophone(int subtype, String[] body, byte[] bytes);

    public void handleDialog(int subtype, String[] body, byte[] bytes);

    public void handlePaint(int subtype, String[] body, byte[] bytes);

    public void handleMouse(int subtype, String[] body, byte[] bytes);

    // DirectTransfer

    public void sendProgress(long sent, long size, long speed, long rest);

    public void sendDone(long size);

    public void sendFailed(Throwable ex);

    public void receiveProgress(long got, long size, long speed, long rest);

    public void receiveDone(long size);

    public void receiveFailed(Throwable ex);

    // ScreenStreaming

    public void screenUpdated(BufferedImage inputBuf);

}
