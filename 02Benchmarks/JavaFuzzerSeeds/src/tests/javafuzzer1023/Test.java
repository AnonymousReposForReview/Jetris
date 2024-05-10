package tests.javafuzzer1023;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:55:28 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=13524L;
    public static float fFld=16.571F;
    public static int iFld1=-13;
    public short sFld=-1014;
    public static short sArrFld[]=new short[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-8046);
        FuzzerUtils.init(Test.lArrFld, -20887L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        int i5=-122, i6=-9, iArr1[][]=new int[N][N];
        double d=-2.129496;

        FuzzerUtils.init(iArr1, -13);

        i5 %= (int)(i5 | 1);
        d -= Test.instanceCount;
        i5 >>= 48962;
        i5 = i5;
        i5 <<= i6;
        iArr1 = iArr1;
        vMeth2_check_sum += i5 + Double.doubleToLongBits(d) + i6 + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1() {

        int i3=-132, i4=-7003, i7=176, i8=-172, i10=2, i11=-22553, iArr2[]=new int[N];
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(iArr2, 12);
        FuzzerUtils.init(lArr, -52L);

        for (i3 = 1; i3 < 195; i3++) {
            vMeth2();
            Test.instanceCount = i3;
            i4 = (int)Test.instanceCount;
            Test.instanceCount = i4;
            for (i7 = 1; i7 < 8; ++i7) {
                iArr2[i3] = (int)Test.instanceCount;
            }
            Test.sArrFld[i3] <<= (short)Test.instanceCount;
        }
        for (int i9 : iArr2) {
            for (i10 = 1; 4 > i10; ++i10) {
                long l1=-5848665568373042884L;
                i4 -= (int)Test.fFld;
                Test.instanceCount = i7;
                l1 += i10;
                i8 ^= i7;
                lArr[i10 - 1][i10 + 1] |= i8;
            }
        }
        vMeth1_check_sum += i3 + i4 + i7 + i8 + i10 + i11 + FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr);
    }

    public void vMeth(long l, int i2) {

        int i12=4, i13=118, i14=8, i15=3, iArr3[]=new int[N];
        float f=0.329F;
        boolean b=false;
        double d1=87.86259;

        FuzzerUtils.init(iArr3, -56755);

        vMeth1();
        for (i12 = 3; i12 < 227; ++i12) {
            f = 1;
            do {
                short s=-6905;
                s += (short)(((f * l) + i12) - i13);
                i13 *= (int)-73.684F;
                i13 = i13;
                iArr3 = iArr3;
                if (true) {
                    Test.fFld = i2;
                    for (i14 = 1; i14 < 1; ++i14) {
                        b = b;
                        i2 = (int)d1;
                        i13 += i2;
                        i15 = (int)l;
                    }
                    if (b) break;
                } else if (b) {
                    i13 += i12;
                } else {
                    iArr3[i12] -= (int)Test.instanceCount;
                }
            } while (++f < 7);
        }
        vMeth_check_sum += l + i2 + i12 + i13 + Float.floatToIntBits(f) + i14 + i15 + (b ? 1 : 0) +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr3);
    }

    public void mainTest(String[] strArr3) {

        int i16=62485, i17=-19, i18=-36249, i19=13, i20=-163, i21=43, i22=165, i23=6, iArr4[]=new int[N];
        double d2=-1.69218;
        float f1=70.330F;
        byte by=59;

        FuzzerUtils.init(iArr4, -6);

        vMeth(Test.instanceCount, Test.iFld1);
        for (i16 = 9; 160 > i16; i16++) {
            Test.iFld1 <<= i16;
        }
        i17 = (int)Test.instanceCount;
        iArr4[(-99 >>> 1) % N] = 23;
        d2 = f1;
        iArr4[(i16 >>> 1) % N] = i17;
        Test.iFld1 ^= i16;
        for (i18 = 5; 249 > i18; ++i18) {
            iArr4[i18 + 1] = i19;
            for (i20 = 5; i20 < 103; ++i20) {
                i21 = i18;
                for (i22 = 1; 2 > i22; ++i22) {
                    i21 = (int)f1;
                    i17 &= -57541;
                    switch ((((i23 >>> 1) % 8) * 5) + 80) {
                    case 99:
                        d2 += d2;
                        Test.instanceCount = i22;
                        break;
                    case 116:
                        Test.iFld1 /= (int)(Test.instanceCount | 1);
                        i21 <<= i17;
                        break;
                    case 105:
                        try {
                            i21 = (Test.iFld1 / -34118);
                            i21 = (i17 / i22);
                            i19 = (i19 / i17);
                        } catch (ArithmeticException a_e) {}
                        Test.lArrFld[i20 + 1] = sFld;
                        Test.instanceCount += (long)f1;
                        i17 -= i18;
                        break;
                    case 82:
                        switch (((i22 % 4) * 5) + 12) {
                        case 28:
                            i21 += (i22 + i17);
                            i23 = i18;
                            iArr4[i20] = i22;
                            i23 = (int)-3959023202L;
                        case 32:
                            sFld += (short)i18;
                            break;
                        case 19:
                        case 16:
                        default:
                            Test.instanceCount += (((i22 * Test.instanceCount) + i16) - f1);
                        }
                        break;
                    case 88:
                        iArr4[i18] -= -1;
                        break;
                    case 110:
                        f1 *= Test.iFld1;
                        break;
                    case 83:
                        Test.iFld1 -= -6532;
                        break;
                    case 94:
                        d2 -= f1;
                        break;
                    default:
                        by *= (byte)i20;
                    }
                }
            }
        }


    }
    public static void main(String[] strArr2) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr2);
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