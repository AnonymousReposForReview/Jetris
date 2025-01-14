package tests.javafuzzer1064;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 13:48:38 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3137960953459522713L;
    public static long lFld=-29L;
    public static short sFld=30630;
    public static boolean bFld=false;
    public static short sArrFld[]=new short[N];
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-10349);
        FuzzerUtils.init(Test.lArrFld, 39194L);
        FuzzerUtils.init(Test.iArrFld, -153);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(float f) {

        byte by=-80;
        double d=-18.85420;
        int i7=-37, i8=-42, i9=-7, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 12);

        f -= by;
        if (Test.bFld) {
            f = (float)d;
            for (int i6 : iArr1) {
                Test.lFld *= Test.lFld;
                Test.sArrFld[(i6 >>> 1) % N] >>= (short)Test.instanceCount;
                i6 = i6;
                i7 = 1;
                do {
                    Test.lArrFld[i7 + 1] >>= -7;
                    for (i8 = 1; i8 > 1; i8 -= 3) {
                        i6 = (int)d;
                        Test.instanceCount >>= -27;
                        i6 = (int)Test.instanceCount;
                        Test.sFld += (short)Test.instanceCount;
                    }
                    i9 = Test.sFld;
                } while (++i7 < 4);
            }
        } else {
            iArr1[(i9 >>> 1) % N] -= (int)135L;
        }
        vMeth2_check_sum += Float.floatToIntBits(f) + by + Double.doubleToLongBits(d) + i7 + i8 + i9 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1() {

        int i4=37511, i5=-7, i10=-3, i11=9, i13=27245, i14=-8993, iArr[]=new int[N];
        float f1=1.747F;
        double d1=110.129035;
        long l=251L;

        FuzzerUtils.init(iArr, 52932);

        Test.instanceCount += (iArr[(i4 >>> 1) % N] - ((i4 * i4) * Math.min(i4, i4)));
        i5 = 1;
        while (++i5 < 190) {
            vMeth2(f1);
        }
        i10 = 1;
        do {
            int i12=-45624;
            d1 -= f1;
            i4 = i11;
            i4 >>= i12;
        } while (++i10 < 296);
        i11 = 3;
        switch ((((i4 >>> 1) % 9) * 5) + 97) {
        case 111:
            if (Test.bFld) {
                i11 = i5;
                d1 += i10;
                for (i13 = 14; 227 > i13; i13++) {
                    i4 *= i11;
                    Test.lFld = i10;
                }
            }
        case 130:
            i11 += (int)l;
        case 104:
            i14 -= i14;
            break;
        case 114:
            f1 = i10;
            break;
        case 105:
            i11 = i10;
            break;
        case 100:
            Test.instanceCount += Test.lFld;
            break;
        case 109:
            i11 = i13;
            break;
        case 107:
            i4 |= -44762;
            break;
        case 142:
            Test.instanceCount += (long)f1;
        default:
            i14 ^= i10;
        }
        vMeth1_check_sum += i4 + i5 + Float.floatToIntBits(f1) + i10 + Double.doubleToLongBits(d1) + i11 + i13 + i14 +
            l + FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i2, int i3) {

        int i15=-12709, i16=57553, i17=36048, i18=10120;
        float f2=-66.713F;
        byte by1=-73;
        double d2=-2.44437;

        vMeth1();
        Test.sFld += (short)-6;
        if (Test.bFld) {
            i2 = i3;
            for (i15 = 10; i15 < 278; i15++) {
                f2 += (i15 - i15);
                Test.lArrFld[i15 + 1] = Test.sFld;
                Test.instanceCount *= by1;
                Test.iArrFld[i15] *= i15;
            }
        } else if (Test.bFld) {
            i3 = i2;
        } else {
            Test.lFld = i15;
        }
        f2 += (float)d2;
        for (i17 = 3; i17 < 210; ++i17) {
            Test.lFld = i3;
            Test.instanceCount = i3;
        }
        vMeth_check_sum += i2 + i3 + i15 + i16 + Float.floatToIntBits(f2) + by1 + Double.doubleToLongBits(d2) + i17 +
            i18;
    }

    public void mainTest(String[] strArr1) {

        int i=-34981, i1=-35014, i19=144, i20=0, i21=9, i22=-7, i23=-37, i24=-133, i25=19790;
        float f3=106.529F, f4=2.428F;
        double d3=-69.125658, dArr[]=new double[N];

        FuzzerUtils.init(dArr, -123.47968);

        for (i = 1; i < 169; ++i) {
            vMeth(i, i);
        }
        for (i19 = 11; i19 < 267; ++i19) {
            for (i21 = 1; i21 < 98; ++i21) {
                Test.bFld = Test.bFld;
                i1 += (((i21 * i) + i22) - i21);
                i1 >>= i19;
                i20 -= i19;
                i1 = (int)Test.instanceCount;
                Test.instanceCount = i;
                f3 -= i;
                d3 -= i20;
            }
            for (f4 = 98; f4 > 6; --f4) {
                Test.lArrFld[(int)(f4 + 1)] *= Test.instanceCount;
                f3 *= f4;
                i22 = i22;
                dArr = dArr;
                Test.lFld = i;
            }
            if (Test.bFld) continue;
            Test.instanceCount = i21;
            Test.iArrFld[i19 - 1] *= (int)f4;
            i1 += i21;
            i22 <<= 42198;
            for (i24 = 2; i24 < 98; ++i24) {
                byte by2=-117;
                i1 += i24;
                i25 = i23;
                Test.instanceCount += (long)f4;
                Test.lFld -= Test.instanceCount;
                by2 |= (byte)i21;
            }
            Test.lArrFld[i19] = i21;
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
