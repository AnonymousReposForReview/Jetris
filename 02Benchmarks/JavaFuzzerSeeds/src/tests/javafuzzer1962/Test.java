package tests.javafuzzer1962;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 06:35:44 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=3L;
    public static short sFld=-4878;
    public static short sArrFld[][]=new short[N][N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.sArrFld, (short)-14650);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(long l, int i8, int i9) {

        double d=-2.35240;
        int i10=-9, i11=9, i12=53980, i13=57, iArr1[]=new int[N];
        float f2=2.436F, f3=0.892F;
        boolean b=false;
        byte by1=18;
        short s=-14057, sArr[]=new short[N];

        FuzzerUtils.init(iArr1, -49);
        FuzzerUtils.init(sArr, (short)-20516);

        i8 *= (int)d;
        for (i10 = 6; i10 < 237; ++i10) {
            i8 = -4350;
            for (i12 = 1; i12 < 7; ++i12) {
                i13 = i9;
                f2 = 2;
                do {
                    iArr1[(int)(f2)] >>= i12;
                    b = b;
                    i11 += i13;
                    switch ((i10 % 4) + 14) {
                    case 14:
                        sArr[(int)(f2)] &= (short)i11;
                        break;
                    case 15:
                        i9 += -17;
                        i9 += (int)(6.380F + (f2 * f2));
                    case 16:
                        f3 *= by1;
                        iArr1[(int)(f2 + 1)] *= (int)f3;
                        break;
                    case 17:
                        i13 = s;
                        break;
                    }
                } while (--f2 > 0);
            }
        }
        vMeth2_check_sum += l + i8 + i9 + Double.doubleToLongBits(d) + i10 + i11 + i12 + i13 + Float.floatToIntBits(f2)
            + (b ? 1 : 0) + Float.floatToIntBits(f3) + by1 + s + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(sArr);
    }

    public static void vMeth1(int i4, float f1, int i5) {

        int i6=-13, i7=28832, i14=1, i15=-229, i16=-123, i17=31469, i18=-8635, i19=-14623, i20=23679, i21=15526,
            i22=-49795;
        double d1=0.22629, dArr[]=new double[N];

        FuzzerUtils.init(dArr, 0.27531);

        for (i6 = 4; i6 < 336; ++i6) {
            vMeth2(Test.instanceCount, -82, i6);
            for (i14 = i6; i14 < 5; i14++) {
                dArr[i6] += i14;
            }
        }
        for (i16 = 17; i16 < 351; ++i16) {
            i5 = i4;
            i15 >>>= i5;
        }
        for (i18 = 1; i18 < 161; i18++) {
            Test.sFld += (short)(i18 ^ Test.sFld);
            for (i20 = 10; i20 > 1; i20 -= 3) {
                i5 = i19;
                i22 = 1;
                do {
                    Test.instanceCount = (long)d1;
                } while (++i22 < 4);
                Test.instanceCount *= Test.instanceCount;
                i4 *= (int)f1;
            }
        }
        vMeth1_check_sum += i4 + Float.floatToIntBits(f1) + i5 + i6 + i7 + i14 + i15 + i16 + i17 + i18 + i19 + i20 +
            i21 + i22 + Double.doubleToLongBits(d1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(int i2, float f, byte by) {

        int i3=4, iArr[]=new int[N];
        boolean b1=true;

        FuzzerUtils.init(iArr, 0);

        i3 = 326;
        do {
            iArr[i3] <<= (i2 - (i2 = (i2--)));
            vMeth1(i2, -46.652F, i3);
            if (b1) {
                b1 = b1;
                by += (byte)(((i3 * i3) + f) - by);
                i2 *= Test.sFld;
                i2 = -8994;
                vMeth_check_sum += i2 + Float.floatToIntBits(f) + by + i3 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
                return;
            } else if (b1) {
                by -= (byte)f;
                Test.instanceCount += (((i3 * i3) + i3) - Test.instanceCount);
                Test.sFld >>= (short)Test.instanceCount;
            } else if (true) {
                i2 -= (int)f;
                iArr[i3 + 1] += (int)Test.instanceCount;
                i2 = i2;
                iArr[i3 - 1] -= (int)Test.instanceCount;
            }
        } while (--i3 > 0);
        vMeth_check_sum += i2 + Float.floatToIntBits(f) + by + i3 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-52704, i1=147, i23=-44025, i24=-8, i25=119;
        float f4=15.937F, f5=-1.120F;
        byte by2=-60;
        double d2=-1.13149;

        for (i = 1; i < 173; i++) {
            vMeth(i, f4, by2);
            Test.instanceCount &= Test.instanceCount;
            Test.instanceCount = (long)d2;
            for (i23 = 7; i23 < 146; ++i23) {
                short s1=155;
                i1 = s1;
                Test.instanceCount += i;
                i1 -= (int)f4;
                i1 <<= by2;
                switch (((i24 >>> 1) % 3) + 42) {
                case 42:
                    switch (((i >>> 1) % 2) + 34) {
                    case 34:
                        for (f5 = 1; f5 < 2; f5 += 2) {
                            i1 >>= (int)-1052105901L;
                            switch ((i % 1) + 15) {
                            case 15:
                                i24 |= (int)Test.instanceCount;
                                Test.instanceCount = 103;
                                break;
                            }
                            f4 += i25;
                            i25 |= 190;
                            i1 += (192 + (f5 * f5));
                            i25 >>= 91;
                        }
                        Test.sArrFld[i23 + 1] = FuzzerUtils.short1array(N, (short)-22406);
                        break;
                    case 35:
                        i24 = (int)Test.instanceCount;
                        break;
                    default:
                        iArrFld[i23] <<= -39;
                        Test.instanceCount <<= 15768;
                    }
                    Test.instanceCount += (9158050017928961657L + (i23 * i23));
                    i24 -= i;
                    break;
                case 43:
                    iArrFld[i - 1] = Test.sFld;
                    f4 = i24;
                    i24 &= i24;
                    i25 = i23;
                    break;
                case 44:
                    f4 = i24;
                default:
                    f4 *= 13197;
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
