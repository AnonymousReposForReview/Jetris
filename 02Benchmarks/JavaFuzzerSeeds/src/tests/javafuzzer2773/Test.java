package tests.javafuzzer2773;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 19:57:30 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3201L;
    public static int iFld=-45;
    public static float fFld=0.572F;
    public long lArrFld[]=new long[N];

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long dMeth_check_sum = 0;

    public static int iMeth(double d) {

        int i2=-21010, i3=-8, i4=-141, i5=-29550, i6=-3, i7=22370, i8=-220, i9=-14, iArr1[]=new int[N];
        float f=103.614F;

        FuzzerUtils.init(iArr1, -57);

        i2 = 1;
        do {
            i3 = 7;
            while (--i3 > 0) {
                i4 += (int)(-1L + (i3 * i3));
                switch ((((i4 -= i2) >>> 1) % 1) + 17) {
                case 17:
                default:
                    i4 -= (int)(~((i2 - -1573735981L) * (i4 << i3)));
                }
                for (i5 = 1; i5 < 1; i5++) {
                    i6 += (-108 + (i5 * i5));
                    try {
                        i4 = (iArr1[i3 + 1] / -82);
                        i4 = (i6 % 70);
                        iArr1[i3 + 1] = (i6 % -293497277);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount <<= (i4--);
                    i4 >>= (int)((f++) % (Math.abs(Integer.reverseBytes(i2)) | 1));
                }
                for (i7 = 1; i7 < 1; i7++) {
                    i6 >>= iArr1[i3];
                    i8 = (Integer.reverseBytes(i9 + i4) - Integer.reverseBytes(i8));
                    i8 += (i7 * i7);
                    d *= iArr1[i2 + 1];
                }
            }
        } while (++i2 < 247);
        long meth_res = Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + i6 + Float.floatToIntBits(f) + i7 + i8 + i9 +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static double dMeth() {

        int iArr3[]=new int[N];

        FuzzerUtils.init(iArr3, -9746);

        iArr3[(Test.iFld >>> 1) % N] &= Test.iFld;
        long meth_res = FuzzerUtils.checkSum(iArr3);
        dMeth_check_sum += meth_res;
        return (double)meth_res;
    }

    public static void vMeth1(int i10) {

        int i11=-1, i12=1083, i13=-198, i14=-14464, i15=6, i16=-184, iArr2[][]=new int[N][N];
        long l1=-128L, l2=-11L, lArr[]=new long[N];
        double d1=0.59980, dArr1[]=new double[N];
        byte by=99;
        short s=-23183;
        float f1=-4.32F;

        FuzzerUtils.init(lArr, -14L);
        FuzzerUtils.init(iArr2, 65);
        FuzzerUtils.init(dArr1, -1.35418);

        for (i11 = 6; 214 > i11; ++i11) {
            l1 = 1;
            do {
                i12 += (int)(lArr[(int)(l1 + 1)] - (i10 = (--Test.iFld)));
                i12 += (int)lArr[i11 + 1];
                for (l2 = 1; l2 < 1; l2 += 2) {
                    iArr2[(int)(l2)][(int)(l1)] -= (int)(lArr[(int)(l2 + 1)] -= iArr2[i11 + 1][(int)(l2)]);
                }
                for (i14 = 1; i14 < 1; i14++) {
                    i15 += (int)(dMeth() + i14);
                    lArr[i14 - 1] *= (long)d1;
                    Test.instanceCount += (10 + (i14 * i14));
                    Test.instanceCount = by;
                    dArr1[i14 + 1] = s;
                }
            } while (++l1 < 8);
            for (f1 = 1; f1 < 8; ++f1) {
                Test.iFld *= (int)-13910L;
                i12 += i16;
            }
        }
        vMeth1_check_sum += i10 + i11 + i12 + l1 + l2 + i13 + i14 + i15 + Double.doubleToLongBits(d1) + by + s +
            Float.floatToIntBits(f1) + i16 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1));
    }

    public static void vMeth(long l, int i1) {

        byte by1=54;
        int i17=-3, i18=5420, i19=-187, i20=-127, i21=-1, i22=-11, iArr4[]=new int[N];
        boolean b=false;
        double d2=-83.108880, dArr[]=new double[N];

        FuzzerUtils.init(dArr, -75.107373);
        FuzzerUtils.init(iArr4, 4192);

        iMeth(dArr[(i1 >>> 1) % N]);
        vMeth1(i1);
        by1 *= (byte)Test.fFld;
        for (i17 = 1; 357 > i17; i17++) {
            iArr4[(i18 >>> 1) % N] = i18;
            l = i18;
            for (i19 = i17; i19 < 5; ++i19) {
                l += (i19 * i19);
                Test.fFld = i1;
                for (i21 = i19; i21 < 1; i21++) {
                    short s1=-22081;
                    switch ((i17 % 4) + 78) {
                    case 78:
                        switch ((i21 % 9) + 6) {
                        case 6:
                            i1 -= s1;
                            break;
                        case 7:
                            i1 &= i17;
                            b = true;
                            break;
                        case 8:
                            i20 >>>= Test.iFld;
                            break;
                        case 9:
                            d2 += 43L;
                            break;
                        case 10:
                            i1 = (int)l;
                            break;
                        case 11:
                            Test.iFld += by1;
                            break;
                        case 12:
                            if (b) continue;
                            break;
                        case 13:
                            i20 += 31946;
                        case 14:
                            l = Test.instanceCount;
                            break;
                        default:
                            d2 += -119.390F;
                        }
                        break;
                    case 79:
                        Test.fFld = Test.fFld;
                        break;
                    case 80:
                        i22 += i21;
                        break;
                    case 81:
                        l += (-9 + (i21 * i21));
                        break;
                    }
                }
            }
        }
        vMeth_check_sum += l + i1 + by1 + i17 + i18 + i19 + i20 + i21 + i22 + (b ? 1 : 0) + Double.doubleToLongBits(d2)
            + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr4);
    }

    public void mainTest(String[] strArr1) {

        int i=-8, i23=-45155, i24=8, i25=8, i26=179, iArr[]=new int[N];
        float f2=-31.866F, fArr[][]=new float[N][N];
        double d3=54.2948;
        byte by2=-52;
        boolean b1=true;
        short s2=-18362;

        FuzzerUtils.init(iArr, 26258);
        FuzzerUtils.init(fArr, 0.922F);

        lArrFld[(97 >>> 1) % N] = ((i * i) - (Long.reverseBytes(Test.instanceCount) + (iArr[(i >>> 1) % N]++)));
        i += i;
        vMeth(Test.instanceCount, Test.iFld);
        f2 = 1;
        do {
            Test.iFld <<= 83;
            Test.iFld += Test.iFld;
            iArr[(int)(f2 + 1)] = Test.iFld;
            if (b1) {
                d3 -= d3;
                i23 = 1;
                do {
                    lArrFld[(int)(f2)] ^= Test.iFld;
                    Test.instanceCount += i23;
                    by2 += (byte)i23;
                    fArr[(int)(f2 + 1)][(i >>> 1) % N] += i;
                    i += i23;
                    lArrFld[i23] &= 115;
                    i = (int)-360764478L;
                    Test.instanceCount = Test.iFld;
                    for (i24 = 1; i24 < 1; ++i24) {
                        i = by2;
                        try {
                            Test.iFld = (-79 % Test.iFld);
                            i = (iArr[i24 - 1] % i24);
                            Test.iFld = (i23 % i25);
                        } catch (ArithmeticException a_e) {}
                        i25 += (i24 * i24);
                        switch (((-32812 >>> 1) % 5) + 75) {
                        case 75:
                            i += i24;
                            if (b1) continue;
                            i >>>= -39044;
                        case 76:
                            by2 += (byte)(((i24 * i26) + i23) - i25);
                            break;
                        case 77:
                            s2 *= (short)Test.iFld;
                        case 78:
                            d3 = Test.iFld;
                            iArr = iArr;
                            break;
                        case 79:
                            Test.iFld += i;
                            break;
                        default:
                            lArrFld[(int)(f2)] *= (long)f2;
                        }
                    }
                } while (++i23 < 139);
            } else {
                i += (int)((long)f2 ^ Test.iFld);
            }
        } while (++f2 < 181);


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
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  dMeth ->  dMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}