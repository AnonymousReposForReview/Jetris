package tests.javafuzzer2443;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 14:39:17 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=9L;
    public static double dFld=37.125797;
    public static float fArrFld[]=new float[N];
    public long lArrFld[]=new long[N];
    public static int iArrFld[][]=new int[N][N];
    public int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 56.592F);
        FuzzerUtils.init(Test.iArrFld, -10);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i6=-38061, i7=6, i8=43, i9=11, i10=-58055, i11=47450, iArr[]=new int[N];
        byte by=56;
        double d=104.108083;
        float f=-82.777F;
        short s=7113;

        FuzzerUtils.init(iArr, 15599);

        Test.instanceCount -= i6;
        by = (byte)i6;
        i6 -= (int)d;
        i6 = i6;
        i6 <<= i6;
        iArr[(i6 >>> 1) % N] *= i6;
        for (i7 = 2; 326 > i7; ++i7) {
            for (f = 5; f > 1; f -= 3) {
                iArr[(int)(f + 1)] *= i9;
                s += (short)((long)f ^ i9);
                i8 += (int)(((f * i8) + by) - f);
                for (i10 = 5; 1 < i10; i10--) {
                    by = (byte)i9;
                    i11 -= i7;
                }
                d += i9;
            }
        }
        long meth_res = i6 + by + Double.doubleToLongBits(d) + i7 + i8 + Float.floatToIntBits(f) + i9 + s + i10 + i11 +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(long l, int i2, int i3) {

        int i4=-169, i5=-4, i12=58852, i13=-8, i14=-6, iArr1[]=new int[N];
        long l1=208L;
        float f1=0.26F;
        byte by1=38;

        FuzzerUtils.init(iArr1, -2947);

        for (i4 = 6; i4 < 124; ++i4) {
            Test.instanceCount ^= iMeth();
            Test.fArrFld[i4 + 1] = i5;
            for (l1 = 1; l1 < 13; ++l1) {
                short s1=29932;
                switch ((((i12 >>> 1) % 8) * 5) + 34) {
                case 56:
                    i2 += (int)(((l1 * i4) + f1) - i5);
                    i2 *= i5;
                    i3 += (54791 + (l1 * l1));
                    i2 <<= s1;
                    break;
                case 70:
                    iArr1[(int)(l1 + 1)] = (int)l1;
                case 64:
                    switch (((i5 >>> 1) % 1) + 23) {
                    case 23:
                        for (i13 = 1; i13 < 2; i13 += 3) {
                            by1 = (byte)i4;
                            i5 += (int)f1;
                            i2 += (((i13 * f1) + Test.instanceCount) - i3);
                        }
                        break;
                    default:
                        i2 = 2;
                    }
                    break;
                case 59:
                    if (i4 != 0) {
                        vMeth1_check_sum += l + i2 + i3 + i4 + i5 + l1 + i12 + Float.floatToIntBits(f1) + i13 + i14 +
                            by1 + FuzzerUtils.checkSum(iArr1);
                        return;
                    }
                    break;
                case 47:
                    i3 += i2;
                    break;
                case 50:
                    s1 = (short)125L;
                    break;
                case 53:
                    s1 += (short)(l1 + by1);
                    break;
                case 45:
                    i3 = i3;
                    break;
                default:
                    if (false) break;
                }
            }
        }
        vMeth1_check_sum += l + i2 + i3 + i4 + i5 + l1 + i12 + Float.floatToIntBits(f1) + i13 + i14 + by1 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i, int i1) {

        int i15=-23045, i16=170, i17=50, i18=50157, iArr2[]=new int[N];
        short s2=8961;
        boolean b=false;
        byte by2=-33;
        float f2=0.857F;

        FuzzerUtils.init(iArr2, -23172);

        try {
            vMeth1(Test.instanceCount, 37566, i);
            i15 = 1;
            while (++i15 < 177) {
                i16 = 1;
                while (++i16 < 9) {
                    i -= i1;
                    if (b) {
                        s2 += (short)(((i16 * i) + Test.instanceCount) - i16);
                    }
                    Test.dFld *= i1;
                    i = by2;
                    for (i17 = i15; i17 < 1; i17++) {
                        i1 %= (int)((long)(f2) | 1);
                        iArr2[i16 - 1] = i18;
                        i *= (int)Test.dFld;
                        i18 -= (int)f2;
                        Test.instanceCount += (i17 ^ i18);
                    }
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exc1) {
            Test.instanceCount *= 2;
        }
        vMeth_check_sum += i + i1 + i15 + i16 + s2 + (b ? 1 : 0) + by2 + i17 + i18 + Float.floatToIntBits(f2) +
            FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i19=63252, i20=-229, i21=10, i22=-25836, i23=38387, i24=-4, i25=212, i26=-14, i28=10, i29=32, i30=-210,
            i31=59231;
        boolean b1=false;
        float f3=0.592F, f4=10.294F, f5=0.366F;
        short s3=-4199;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 0.22151);

        vMeth(i19, i19);
        for (i20 = 10; i20 < 296; ++i20) {
            dArr[i20 + 1] = i21;
            i19 *= (int)Test.instanceCount;
            i19 >>= i20;
            i22 = 1;
            do {
                for (i23 = 1; i23 < 4; i23++) {
                    lArrFld[i22] += i23;
                }
                i21 -= (int)Test.instanceCount;
                if (b1) break;
            } while ((i22 += 3) < 88);
        }
        for (i25 = 11; i25 < 192; i25++) {
            Test.iArrFld[i25 + 1][i25 - 1] += (int)Test.instanceCount;
        }
        i19 -= i26;
        iArrFld1[(i26 >>> 1) % N] = i24;
        for (int i27 : iArrFld1) {
            i28 = 1;
            while (++i28 < 63) {
                dArr[i28] -= Test.instanceCount;
                for (f3 = 1; f3 < 1; f3++) {
                    iArrFld1[i28 + 1] = (int)Test.instanceCount;
                }
                f4 += Test.instanceCount;
                i27 = i24;
                for (f5 = 1; f5 < 1; f5++) {
                    i29 = (int)Test.instanceCount;
                    Test.instanceCount += (long)f5;
                    Test.instanceCount >>= Test.instanceCount;
                    i21 += (int)((long)f5 ^ i23);
                    s3 = (short)-5491;
                    i27 += (int)f5;
                    i31 = (int)Test.instanceCount;
                }
                i24 += (i28 + f4);
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}