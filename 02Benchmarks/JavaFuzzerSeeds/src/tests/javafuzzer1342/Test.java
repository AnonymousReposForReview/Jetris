package tests.javafuzzer1342;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 18:32:29 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1075067045813815806L;
    public static volatile double dFld=-103.32320;
    public short sFld=-10870;
    public int iFld=9;
    public static volatile byte byArrFld[]=new byte[N];
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)15);
        FuzzerUtils.init(Test.iArrFld, -139);
        FuzzerUtils.init(Test.fArrFld, -7.892F);
        FuzzerUtils.init(Test.lArrFld, 45589L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static double dMeth(double d1, float f1) {

        int i8=-63, i9=-48123, i10=-40907, i11=-45736, i12=37260, i13=9, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 4);

        for (byte by : Test.byArrFld) {
            for (i8 = 1; i8 < 4; i8++) {
                i9 += (-46963 + (i8 * i8));
                f1 = Test.instanceCount;
                Test.instanceCount -= i9;
                i10 = 1;
                while (++i10 < 2) {
                    iArr1[i10 + 1] = (int)Test.instanceCount;
                    i9 /= (int)((long)(f1) | 1);
                    iArr1[i10 + 1] = -24;
                    iArr1[i8 + 1] <<= i9;
                }
                i9 = i9;
                i11 += i8;
                for (i12 = 2; i12 > 1; i12--) {
                    i13 += i11;
                    i11 += (i12 - f1);
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d1) + Float.floatToIntBits(f1) + i8 + i9 + i10 + i11 + i12 + i13 +
            FuzzerUtils.checkSum(iArr1);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth1() {

        int i3=-14861, i4=-183, i5=-1, i6=14, i7=20434, i14=30, iArr[]=new int[N];
        float f=1.569F;
        short s=-23682, sArr[]=new short[N];

        FuzzerUtils.init(iArr, -196);
        FuzzerUtils.init(sArr, (short)-25936);

        Test.instanceCount -= (long)(((i3 + f) / ((Test.instanceCount--) | 1)) - iArr[(i3 >>> 1) % N]);
        for (i4 = 14; 357 > i4; i4++) {
            i5 = (int)(Test.dFld - ((s / (i3 | 1)) + (i3--)));
            i5 += (61 + (i4 * i4));
            for (i6 = i4; i6 < 5; ++i6) {
                Test.instanceCount = (long)(((i3 * i4) + (i7 + i5)) * ((-4.38117 + (i6 + i4)) * (-245073595732092933L *
                    Test.instanceCount)));
                i3 += i6;
                sArr[i6] += (short)(dMeth(Test.dFld, f) * i4);
            }
            iArr[i4] = s;
            Test.byArrFld[i4 + 1] = (byte)Test.instanceCount;
            switch (((i6 >>> 1) % 2) + 118) {
            case 118:
                i7 = s;
                i14 = 1;
                while (++i14 < 5) {
                    i3 += (int)Test.dFld;
                    i5 = i5;
                }
                break;
            case 119:
                i3 += i4;
                break;
            default:
                i3 += (int)Test.dFld;
            }
        }
        vMeth1_check_sum += i3 + Float.floatToIntBits(f) + i4 + i5 + s + i6 + i7 + i14 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth(double d) {

        int i1=146, i2=-143, i16=40879;
        boolean b=true;

        for (i1 = 321; i1 > 16; i1 -= 2) {
            vMeth1();
            i2 = i2;
            Test.instanceCount += i1;
            Test.iArrFld[i1 - 1] >>= i2;
        }
        i16 = 1;
        while (++i16 < 291) {
            if (b) continue;
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i1 + i2 + i16 + (b ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {

        int i=-5, i17=-5, i18=-234, i19=-10, i20=-50546;
        float f2=-1.1017F, f3=5.606F;
        byte by1=-94;
        boolean b1=false;
        double d2=-1.50727, dArr[]=new double[N];

        FuzzerUtils.init(dArr, 2.94670);

        Test.instanceCount -= (-(--i));
        i += i;
        vMeth(Test.dFld);
        i = (int)f2;
        for (i17 = 258; i17 > 1; i17--) {
            i18 = i17;
            Test.fArrFld[i17] += i;
            for (i19 = 1; i19 < 98; ++i19) {
                i -= i18;
                by1 = (byte)-240;
                dArr[i19 + 1] -= i;
                switch ((i19 % 6) + 47) {
                case 47:
                    i18 = i17;
                    i = (int)Test.instanceCount;
                    Test.lArrFld[i17 - 1] %= (Test.instanceCount | 1);
                    break;
                case 48:
                    f2 -= i20;
                    i20 ^= i19;
                    sFld <<= (short)i;
                    Test.lArrFld[i19] = -30522;
                case 49:
                    i20 -= (int)Test.instanceCount;
                    Test.instanceCount = (long)f2;
                    break;
                case 50:
                    switch ((((i20 >>> 1) % 5) * 5) + 106) {
                    case 113:
                        Test.instanceCount += iFld;
                        break;
                    case 120:
                        i20 = (int)Test.dFld;
                        Test.lArrFld[i17 - 1] = i19;
                        if (b1) break;
                        Test.instanceCount %= (Test.instanceCount | 1);
                        break;
                    case 115:
                        f3 = 1;
                        while (++f3 < 2) {
                            Test.instanceCount -= sFld;
                            Test.iArrFld[i17] <<= (int)Test.instanceCount;
                        }
                        break;
                    case 110:
                        i18 -= -77;
                    case 128:
                        Test.lArrFld[i17 + 1] -= (long)Test.dFld;
                        break;
                    default:
                        iFld += (i19 | iFld);
                    }
                    break;
                case 51:
                    Test.instanceCount *= (long)d2;
                case 52:
                    f2 -= i;
                    break;
                default:
                    i += (((i19 * i20) + iFld) - i);
                }
            }
        }

    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  dMeth ->  dMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
