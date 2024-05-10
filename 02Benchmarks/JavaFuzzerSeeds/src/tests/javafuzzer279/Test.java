package tests.javafuzzer279;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 01:09:36 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-77L;
    public static volatile byte byFld=125;
    public boolean bFld=false;
    public volatile int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];
    public static double dArrFld[]=new double[N];
    public volatile short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 122.509F);
        FuzzerUtils.init(Test.dArrFld, -1.127108);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(double d1) {

        int i7=-7818, i8=-5966, i9=-31406, i10=18193;
        boolean b=true;
        short s=-4072;
        float f1=-76.521F;

        for (i7 = 7; i7 < 272; i7++) {
            if (b) break;
            if (i8 != 0) {
            }
            s -= (short)i8;
            i9 = 1;
            do {
                switch ((((i8 >>> 1) % 1) * 5) + 32) {
                case 33:
                default:
                    i8 += (int)95L;
                    if (b) break;
                    d1 = f1;
                }
                i10 = 1;
                while (++i10 < 1) {
                    Test.fArrFld[i7] *= i8;
                }
                f1 += i9;
                i8 *= 57012;
                i8 = i10;
            } while (++i9 < 6);
            Test.byFld += (byte)i9;
        }
        long meth_res = Double.doubleToLongBits(d1) + i7 + i8 + (b ? 1 : 0) + s + i9 + Float.floatToIntBits(f1) + i10;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        double d2=-25.99321;

        iMeth1(d2);
        long meth_res = Double.doubleToLongBits(d2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth(long l) {

        int i6=-6, i11=-3, i12=35294, i13=5;
        double d=-46.14415;
        short s1=-13758;
        float f2=-2.777F;
        boolean bArr[][]=new boolean[N][N];

        FuzzerUtils.init(bArr, false);

        i6 = (int)(((d - i6) * (10 + (Test.instanceCount + i6))) - (i6--));
        Test.byFld *= (byte)(iMeth() - 51.352F);
        l = i6;
        s1 -= Test.byFld;
        l >>= i6;
        Test.dArrFld[(-98 >>> 1) % N] = l;
        for (i11 = 8; i11 < 289; ++i11) {
            Test.instanceCount -= -232L;
            i13 = 1;
            while (++i13 < 6) {
                boolean b1=false;
                switch (((-163 >>> 1) % 1) + 108) {
                case 108:
                    switch ((i13 % 5) + 55) {
                    case 55:
                        i6 <<= 155;
                        l &= l;
                        l >>= i13;
                        break;
                    case 56:
                        f2 /= -81;
                    case 57:
                        bArr[i11][i13 - 1] = b1;
                        break;
                    case 58:
                        i12 = i11;
                        break;
                    case 59:
                        iArrFld[i13 + 1] >>= (int)Test.instanceCount;
                        break;
                    default:
                        iArrFld[i13 - 1] -= i12;
                    }
                    break;
                default:
                    i6 = (int)Test.instanceCount;
                }
            }
        }
        vMeth_check_sum += l + i6 + Double.doubleToLongBits(d) + s1 + i11 + i12 + i13 + Float.floatToIntBits(f2) +
            FuzzerUtils.checkSum(bArr);
    }

    public void mainTest(String[] strArr1) {

        int i=-199, i1=-13277, i2=-9, i3=60457, i4=-6, i5=-140, i14=-34966, i15=43366, i16=-3501, i17=-43;
        float f=126.956F;
        double d3=2.103369;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(lArr, 4983L);

        for (i = 1; 235 > i; ++i) {
            for (i2 = 3; 107 > i2; i2++) {
                i4 = 1;
                while (++i4 < 2) {
                    Test.instanceCount += (i4 | i4);
                    iArrFld[i4 - 1] += ((i1++) - (--i3));
                    i3 = (int)(iArrFld[i2] + ((i1 -= i3) - (f * i1)));
                    Test.instanceCount += (~((i5 - i) * Math.abs(i3)));
                    vMeth(Test.instanceCount);
                    d3 += i5;
                    i1 += (int)d3;
                }
                sArrFld[i - 1] -= (short)i;
                switch ((i % 6) + 43) {
                case 43:
                    i3 = -111;
                    i5 = i5;
                    switch (((i2 % 7) * 5) + 107) {
                    case 113:
                        for (i14 = i; i14 < 2; i14++) {
                            i5 += (i14 ^ i14);
                            i1 = i4;
                            iArrFld[i2] -= i5;
                            i15 >>>= i1;
                            i1 |= (int)Test.instanceCount;
                        }
                        iArrFld[i] = i15;
                    case 120:
                        i3 = i;
                        break;
                    case 116:
                        switch ((i2 % 2) + 34) {
                        case 34:
                            for (i16 = 1; i16 < 2; i16++) {
                                lArr[i2 + 1][i] = i2;
                                iArrFld[(i15 >>> 1) % N] = i2;
                                i5 = -6;
                            }
                        case 35:
                            i17 *= i3;
                            break;
                        }
                        i5 = i15;
                        break;
                    case 126:
                        Test.instanceCount += (((i2 * Test.instanceCount) + i4) - Test.instanceCount);
                        break;
                    case 108:
                        Test.instanceCount += i;
                        break;
                    case 109:
                        i1 /= (int)(i15 | 1);
                        break;
                    case 112:
                        Test.instanceCount = i17;
                        break;
                    }
                    break;
                case 44:
                    i5 += (i2 + Test.instanceCount);
                    break;
                case 45:
                    f += Test.instanceCount;
                    break;
                case 46:
                    if (bFld) continue;
                    break;
                case 47:
                    i15 <<= i17;
                    break;
                case 48:
                    i17 = i3;
                    break;
                default:
                    f = (float)d3;
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
