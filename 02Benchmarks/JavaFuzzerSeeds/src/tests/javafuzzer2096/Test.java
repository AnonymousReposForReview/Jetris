package tests.javafuzzer2096;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:07:00 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3L;
    public static boolean bFld=false;
    public static byte byFld=53;
    public static float fFld=-1.263F;
    public static volatile long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 34352L);
    }

    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i5=17789, i6=-65446, i7=-105, i8=-5, iArr[]=new int[N];
        float f1=-68.140F;
        double d1=87.61026;

        FuzzerUtils.init(iArr, -32925);

        for (i5 = 1; i5 < 213; i5++) {
            i7 = 1;
            do {
                switch (((i6 >>> 1) % 5) + 93) {
                case 93:
                    Test.instanceCount = (long)f1;
                    break;
                case 94:
                    for (d1 = 1; d1 < 1; d1++) {
                        Test.instanceCount += Test.instanceCount;
                        iArr = iArr;
                        i6 += (int)(d1 - i5);
                        iArr[i5 - 1] = i6;
                        Test.byFld %= (byte)(i8 | 1);
                        i6 += (int)d1;
                        i6 += Test.byFld;
                    }
                    break;
                case 95:
                    Test.byFld = (byte)i5;
                    Test.byFld *= (byte)Test.instanceCount;
                    break;
                case 96:
                    i8 += i7;
                    break;
                case 97:
                    Test.instanceCount = i8;
                    break;
                default:
                    i6 = i5;
                }
            } while (++i7 < 8);
        }
        long meth_res = i5 + i6 + i7 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d1) + i8 +
            FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i3, int i4) {

        int i9=10, i10=-4280, i11=104, i12=165, iArr1[]=new int[N];
        double d2=-86.62603, d3=-27.23677;
        float f2=60.67F;
        short s=29957;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(byArr, (byte)-100);
        FuzzerUtils.init(iArr1, 1455);

        i4 = iMeth1();
        i9 = i3;
        switch (((i9 >>> 1) % 2) + 21) {
        case 21:
            d2 *= -3258551742343228630L;
            for (byte by : byArr) {
                i9 = (int)Test.instanceCount;
                for (d3 = 4; d3 > 1; d3--) {
                    for (i11 = 1; i11 < 2; ++i11) {
                        try {
                            i9 = (1889652680 / i11);
                            i9 = (i3 / -195);
                            i12 = (i11 / i4);
                        } catch (ArithmeticException a_e) {}
                        iArr1[(int)(d3 - 1)] >>= (int)Test.instanceCount;
                        Test.instanceCount += i11;
                        i3 = (int)Test.instanceCount;
                        i12 *= -1084;
                        i12 *= i11;
                        Test.instanceCount >>>= i11;
                    }
                }
            }
            break;
        case 22:
            i9 -= i3;
            break;
        default:
            f2 = s;
        }
        long meth_res = i3 + i4 + i9 + Double.doubleToLongBits(d2) + Double.doubleToLongBits(d3) + i10 + i11 + i12 +
            Float.floatToIntBits(f2) + s + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth() {

        double d=-2.100397, d4=110.112463;
        int i13=-32750, i14=-4098, i15=251, i16=-187, i17=-43, i18=6;
        float f3=2.938F;

        Test.bFld = (d == iMeth(i13, -8));
        for (i14 = 15; i14 < 243; i14++) {
            f3 += (i14 - i14);
            f3 -= (float)d;
            Test.instanceCount *= i14;
            for (i16 = 1; i16 < 7; i16++) {
                for (d4 = 1; d4 < 2; d4++) {
                    i18 = i18;
                    Test.instanceCount += (long)d4;
                    Test.instanceCount += (long)(d4 * d4);
                    if (Test.bFld) {
                        i15 = i15;
                    } else if (Test.bFld) {
                        i17 += (int)(((d4 * i17) + i15) - i17);
                    } else {
                        Test.instanceCount -= (long)d;
                        f3 += (float)(d4 + i18);
                    }
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i13 + i14 + i15 + Float.floatToIntBits(f3) + i16 + i17 +
            Double.doubleToLongBits(d4) + i18;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=14, i1=52926, i19=8, i20=-231, iArr2[]=new int[N];
        float f=-2.339F, f4=-2.835F, fArr[]=new float[N];
        long l=-5L;
        double d5=-72.100641;
        short sArr[]=new short[N];

        FuzzerUtils.init(fArr, -81.848F);
        FuzzerUtils.init(sArr, (short)-4574);
        FuzzerUtils.init(iArr2, -6724);

        i = 1;
        do {
            if (Test.bFld) continue;
            f += (Test.lArrFld[i + 1] - ((f - f) * (i - i)));
            Test.byFld += (byte)(((i * i) + i) - i);
            for (l = 5; 117 > l; l++) {
                int i2=62930;
                switch ((int)((l % 8) + 96)) {
                case 96:
                    i2 = (int)Math.min((long)((fArr[(int)(l)]++) + (i2--)), Test.instanceCount >>= (long)(-16.665F -
                        lMeth()));
                    f += f;
                    i2 += (124 + (l * l));
                    break;
                case 97:
                case 98:
                    if (Test.bFld) {
                        switch (((i % 6) * 5) + 76) {
                        case 105:
                            i1 = (int)-2090483852986440857L;
                            break;
                        case 79:
                        case 104:
                            i2 = (int)d5;
                            f += l;
                            break;
                        case 100:
                            i2 += (int)(l | i1);
                            Test.instanceCount <<= Test.instanceCount;
                        case 103:
                            for (i19 = 1; i19 < 2; ++i19) {
                                i20 -= (int)f;
                                switch (((i20 >>> 1) % 1) + 30) {
                                case 30:
                                    i20 = i20;
                                    break;
                                default:
                                    f += i19;
                                    i20 = i19;
                                    Test.instanceCount >>>= i20;
                                    f = i;
                                }
                            }
                            sArr[i] = (short)i;
                            break;
                        case 95:
                            d5 -= i20;
                            Test.instanceCount = -5109;
                            f4 = 1;
                            while (++f4 < 2) {
                                i2 <<= (int)Test.instanceCount;
                                if (false) continue;
                            }
                            break;
                        default:
                            Test.lArrFld[i - 1] ^= l;
                        }
                    } else if (true) {
                        i2 += (int)l;
                    } else if (Test.bFld) {
                        i20 *= (int)d5;
                    } else {
                        Test.bFld = Test.bFld;
                    }
                    break;
                case 99:
                    Test.fFld -= 2354492235L;
                    break;
                case 100:
                    i2 *= i;
                    break;
                case 101:
                    iArr2[(int)(l + 1)] *= (int)f4;
                case 102:
                    i1 <<= i19;
                    break;
                case 103:
                    if (Test.bFld) continue;
                    break;
                }
            }
        } while (++i < 214);


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
//DEBUG  lMeth ->  lMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth lMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
