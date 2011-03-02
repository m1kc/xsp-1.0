/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package xsp;

/**
 *
 * @author m1kc
 */
public interface XSPConstants
{

    // Типы пакетов
    
    // OLD
    // Служебные
    final static int OK = 150;
    final static int INVALID = 151;
    final static int ERROR = 152;
    final static int REFUSED = 153;
    // Обычные NEW
    final static int PING = 0;
    final static int CAPSCHECK = 1;
    // OLD
    final static int MESSAGE = 156;
    final static int TERMINAL = 157;
    final static int FILERQ = 158;
    final static int MICROPHONERQ = 159;
    final static int DIALOGRQ = 1510;
    final static int MICROPHONESTOP = 1511;
    final static int DIALOGSTOP = 1512;
    final static int MOUSE = 1513;
    final static int SCREEN = 1514;

    // Подтипы

    // Generic
    final static int UNKNOWN = 0;
    // PING
    final static int CALL = 0;
    final static int ANSWER = 1;
    // CAPSCHECK
    final static int ASK = 0;
    final static int SUPPORTED = 1;
    final static int NOT_SUPPORTED = 2;

    // Возможности клиента
    final static String[] CAPS = {"PING","MESSAGE","TERMINAL","FILE",
    "MICROPHONE","DIALOG"};
}
