package tests.javafuzzer249;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 00:54:57 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-41586L;
    public static int iFld=-11;
    public long lArrFld[]=new long[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(byte by) {

        long l=-9159807106066374674L, l1=1472L, lArr[]=new long[N];
        int i6=-47951, i7=9, i8=45997, i9=5, i10=34839, iArr1[]=new int[N];
        float f=-118.408F;
        short s=23524;

        FuzzerUtils.init(iArr1, 53094);
        FuzzerUtils.init(lArr, -8L);

        iArr1[(Test.iFld >>> 1) % N] %= 2;
        for (l = 10; l < 192; l++) {
            iArr1[(int)(l)] = by;
            for (i7 = 1; 9 > i7; i7++) {
                f = 1;
                while (++f < 2) {
                    lArr[(int)(l - 1)] -= s;
                }
                Test.instanceCount = l1;
                i8 += (-33246 + (i7 * i7));
                for (i9 = i7; i9 < 2; ++i9) {
                    Test.iFld += (((i9 * f) + i10) - Test.iFld);
                    iArr1[i9 + 1] -= i7;
                    by *= (byte)i10;
                    iArr1[i9 - 1] = i9;
                    i10 = (int)Test.instanceCount;
                    i10 -= i9;
                }
            }
        }
        vMeth2_check_sum += by + l + i6 + i7 + i8 + Float.floatToIntBits(f) + s + l1 + i9 + i10 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(int i3, int i4, int i5) {

        int i11=4, i12=-8, i13=-221, i14=242, iArr[]=new int[N];
        long l2=20559L;
        float f1=2.617F;
        boolean b=true;
        short s1=-32677;

        FuzzerUtils.init(iArr, -38);

        Test.iFld <<= (iArr[(i4 >>> 1) % N]--);
        i4 = iArr[(i3 >>> 1) % N];
        vMeth2((byte)(10));
        iArr[(i5 >>> 1) % N] += i5;
        i11 = 1;
        while (++i11 < 296) {
            for (i12 = 1; i12 < 6; i12++) {
                if (b) {
                    for (l2 = 1; l2 < 2; ++l2) {
                        f1 = l2;
                        iArr[i11] += i14;
                        i13 = i13;
                    }
                } else if (b) {
                    Test.instanceCount += (i12 + Test.instanceCount);
                    vMeth1_check_sum += i3 + i4 + i5 + i11 + i12 + i13 + l2 + i14 + Float.floatToIntBits(f1) + (b ? 1 :
                        0) + s1 + FuzzerUtils.checkSum(iArr);
                    return;
                } else {
                    s1 = s1;
                    i14 -= i5;
                    iArr[i11 + 1] *= (int)f1;
                }
            }
        }
        vMeth1_check_sum += i3 + i4 + i5 + i11 + i12 + i13 + l2 + i14 + Float.floatToIntBits(f1) + (b ? 1 : 0) + s1 +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth(int i1, int i2) {

        int i15=149, i16=-11, i17=-12, i18=45, iArr2[]=new int[N];
        long l3=-27904L;
        byte by1=10;

        FuzzerUtils.init(iArr2, 2);

        vMeth1(i2, i1, Test.iFld);
        Test.instanceCount += i1;
        i15 = 198;
        while (--i15 > 0) {
            for (i16 = 8; i16 > 1; i16 -= 2) {
                short s2=6574;
                i1 = s2;
                if (i16 != 0) {
                    vMeth_check_sum += i1 + i2 + i15 + i16 + i17 + i18 + l3 + by1 + FuzzerUtils.checkSum(iArr2);
                    return;
                }
                i18 = 1;
                while (++i18 < 3) {
                    i17 = i15;
                    i2 *= (int)Test.instanceCount;
                    Test.instanceCount = i18;
                    i1 += (i18 * i18);
                    try {
                        i17 = (i16 % i18);
                        i2 = (1979003901 / iArr2[i18]);
                        i2 = (iArr2[i16 + 1] / i16);
                    } catch (ArithmeticException a_e) {}
                    i2 += i2;
                    l3 = by1;
                    if (i18 != 0) {
                        vMeth_check_sum += i1 + i2 + i15 + i16 + i17 + i18 + l3 + by1 + FuzzerUtils.checkSum(iArr2);
                        return;
                    }
                }
            }
        }
        vMeth_check_sum += i1 + i2 + i15 + i16 + i17 + i18 + l3 + by1 + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i=120, i19=-10, i20=27323, i21=-5, i22=63576, i23=-43418, i24=2, iArr3[]=new int[N];
        short s3=16771, sArr[]=new short[N];
        float f2=0.574F, f3=-1.105F;
        byte by2=-1;
        boolean b1=true;

        FuzzerUtils.init(iArr3, 226);
        FuzzerUtils.init(sArr, (short)15642);

        Test.iFld -= i;
        Test.iFld -= (int)(i - (Double.longBitsToDouble(Test.instanceCount) - i));
        vMeth(i, Test.iFld);
        Test.iFld *= (int)Test.instanceCount;
        i19 = 1;
        while (++i19 < 349) {
            double d=-54.9870;
            Test.iFld += (((i19 * Test.iFld) + s3) - Test.instanceCount);
            i = i;
            f2 -= i;
            iArr3 = iArr3;
            Test.instanceCount <<= -14271;
            d += s3;
            try {
                Test.iFld = (i19 % i19);
                Test.iFld = (13 / i19);
                i = (33179 % i19);
            } catch (ArithmeticException a_e) {}
            for (i20 = 2; 72 > i20; i20 += 2) {
                i += (((i20 * f2) + i19) - f2);
                i21 = i;
                for (f3 = 3; f3 > 1; f3 -= 2) {
                    i21 -= (int)Test.instanceCount;
                    d += i20;
                }
                for (i23 = i20; i23 < 3; i23++) {
                    if (b1) {
                        i <<= (int)Test.instanceCount;
                        switch ((i19 % 7) + 124) {
                        case 124:
                            i24 = i;
                            f2 += Test.instanceCount;
                            Test.iFld += i23;
                            lArrFld[i20 - 1] = Test.iFld;
                            break;
                        case 125:
                            i = (int)Test.instanceCount;
                            lArrFld[i20 + 1] <<= by2;
                            s3 += (short)i23;
                            i24 += (((i23 * Test.instanceCount) + i21) - f3);
                        case 126:
                            Test.instanceCount += Test.instanceCount;
                        case 127:
                            Test.iFld += (i23 - i23);
                            break;
                        case 128:
                            i24 += 107;
                            break;
                        case 129:
                            i24 += (i23 + i20);
                            break;
                        case 130:
                            sArr[i19] = (short)f2;
                            break;
                        default:
                            iArr3[i20] -= i19;
                        }
                    }
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
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
