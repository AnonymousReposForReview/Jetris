package tests.javafuzzer2248;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 10:57:23 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=4154771745L;
    public boolean bFld=true;
    public static int iFld=100;

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public static short sMeth() {

        int i8=11, i9=154, i10=-46021, i11=3, i12=11009, iArr2[]=new int[N];
        double d1=0.15720, d2=-80.119437;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr2, 56);
        FuzzerUtils.init(lArr1, 110L);

        Test.instanceCount *= i8;
        i8 /= (int)(i8 | 1);
        for (i9 = 10; i9 < 288; i9++) {
            Test.instanceCount = -40205;
            iArr2[i9] += -30486;
            lArr1[i9 + 1] = Test.instanceCount;
            for (d1 = i9; d1 < 6; ++d1) {
                i11 = i8;
            }
            i12 = 1;
            do {
                Test.instanceCount = i9;
                d2 = 1;
                do {
                    Test.instanceCount -= i11;
                    if (i11 != 0) {
                    }
                    i8 = -16108;
                } while (++d2 < 1);
                Test.instanceCount -= i12;
            } while (++i12 < 6);
        }
        long meth_res = i8 + i9 + i10 + Double.doubleToLongBits(d1) + i11 + i12 + Double.doubleToLongBits(d2) +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr1);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth1(boolean b) {

        int i1=-21867, i2=6, i3=112, i4=-243, i5=-12, i6=-95, i7=-1, i13=11, i14=-1, iArr1[]=new int[N];
        double d=-76.34405;
        short s=-10452;
        float f1=108.393F;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -193L);
        FuzzerUtils.init(iArr1, -50);

        lArr[(i1 >>> 1) % N] = (long)((iArr1[(i1 >>> 1) % N]--) * ((i1 - d) + (--i1)));
        for (i2 = 259; i2 > 6; i2--) {
            i3 <<= (++s);
            for (i4 = 1; i4 < 6; ++i4) {
                for (i6 = 2; i6 > 1; --i6) {
                    i1 = sMeth();
                }
                i1 *= (int)f1;
            }
            for (i13 = 1; i13 < 6; i13++) {
                lArr[i2] = i7;
                Test.instanceCount = i3;
                i3 = i3;
                i5 -= (int)50194L;
                i5 = -148;
                i3 ^= 14922;
                i14 *= i14;
            }
        }
        vMeth1_check_sum += (b ? 1 : 0) + i1 + Double.doubleToLongBits(d) + i2 + i3 + s + i4 + i5 + i6 + i7 +
            Float.floatToIntBits(f1) + i13 + i14 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(float f) {

        boolean b1=false;
        int i15=20461, i16=-8, i17=13, i18=251, i19=-82, iArr3[][]=new int[N][N];
        long l=-1279929135L;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 122.46654);
        FuzzerUtils.init(iArr3, -31);

        vMeth1(b1);
        for (i15 = 7; i15 < 181; ++i15) {
            i16 *= i16;
            for (i17 = 1; i17 < 9; i17 += 3) {
                i18 = i18;
            }
            dArr[i15 + 1] = 31;
        }
        i16 -= (int)54.936F;
        i19 = 1;
        while ((i19 += 3) < 279) {
            f += 78;
            i18 += (((i19 * f) + f) - i18);
            if (b1) break;
            Test.instanceCount -= Test.instanceCount;
        }
        iArr3[(-9 >>> 1) % N][(i18 >>> 1) % N] = (int)Test.instanceCount;
        i16 -= -53498;
        f += l;
        vMeth_check_sum += Float.floatToIntBits(f) + (b1 ? 1 : 0) + i15 + i16 + i17 + i18 + i19 + l +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr3);
    }

    public void mainTest(String[] strArr1) {

        float f2=-98.25F, fArr[]=new float[N];
        long l1=-570222577L, lArr2[]=new long[N];
        int i20=42782, i21=37719, i22=-11, i23=-10, iArr[]=new int[N];
        double d3=-1.126443;
        byte by=11;
        short s1=-8036;

        FuzzerUtils.init(iArr, -9);
        FuzzerUtils.init(lArr2, 19427L);
        FuzzerUtils.init(fArr, 115.331F);

        for (int i : iArr) {
            vMeth(f2);
            if (bFld) {
                i >>= i;
                for (l1 = 3; l1 < 63; ++l1) {
                    i += (int)(l1 ^ Test.instanceCount);
                    d3 -= l1;
                    i -= i20;
                    for (i21 = 1; i21 < 2; ++i21) {
                        iArr[(int)(l1)] = -54856;
                        f2 += 10L;
                        f2 = i21;
                        if (bFld) break;
                        i20 <<= i;
                        d3 = by;
                        f2 += i20;
                        i += i21;
                    }
                }
                i23 = 1;
                while ((i23 += 2) < 63) {
                    by += (byte)(i23 + by);
                    switch ((i23 % 2) + 34) {
                    case 34:
                        Test.iFld *= Test.iFld;
                        Test.instanceCount += l1;
                        break;
                    case 35:
                        d3 = 153L;
                        if (bFld) {
                            if (false) {
                                switch (((i21 >>> 1) % 3) + 34) {
                                case 34:
                                    Test.instanceCount >>= l1;
                                case 35:
                                    lArr2 = lArr2;
                                    fArr[i23 - 1] *= i22;
                                case 36:
                                    i20 += (i23 - i21);
                                    break;
                                default:
                                    by -= (byte)i21;
                                }
                            } else if (bFld) {
                                lArr2[i23 + 1] -= (long)d3;
                            }
                        }
                        break;
                    default:
                        s1 <<= (short)127;
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
//DEBUG  sMeth ->  sMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
