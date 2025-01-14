package tests.javafuzzer3260;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 05:01:28 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=16106L;
    public static byte byFld=63;
    public short sFld=-4571;

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i5, float f1) {

        long l=-80L, lArr[]=new long[N];
        int i6=-214, i7=-6, i8=-37577, i9=13, i10=63558, i11=179;
        boolean b=true;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 71.776F);
        FuzzerUtils.init(lArr, -56121848L);

        fArr[(i5 >>> 1) % N] *= i5;
        Test.byFld = (byte)l;
        for (i6 = 1; i6 < 196; ++i6) {
            if (b) {
                i5 += (int)l;
                b = b;
            } else if (b) {
                for (i8 = 8; i8 > 1; i8 -= 3) {
                    if (b) {
                        l += i7;
                        for (i10 = 1; 4 > i10; i10++) {
                            double d1=-64.126758;
                            d1 = i6;
                            lArr[i10 - 1] = i9;
                            i11 -= (int)d1;
                            i9 += i10;
                            i11 = i11;
                        }
                    } else if (b) {
                    } else {
                        i9 <<= i9;
                    }
                }
            } else if (b) {
                i9 >>= i6;
            } else {
                b = b;
            }
        }
        long meth_res = i5 + Float.floatToIntBits(f1) + l + i6 + i7 + (b ? 1 : 0) + i8 + i9 + i10 + i11 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i2=-38472, i3=-227, i4=-104, i12=17, i13=-1, i14=-35953, i15=19416, iArr[]=new int[N];
        double d=-2.107087;
        byte by=119;
        float f2=0.479F, fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, -48.701F);
        FuzzerUtils.init(iArr, -7);

        i2 = 1;
        while (++i2 < 391) {
            for (i3 = 1; 4 > i3; ++i3) {
                switch ((i3 % 1) + 47) {
                case 47:
                    i4 *= (int)(((i2 - -106.227F) - d) - ((Test.instanceCount - by) * i4));
                    i4 = iMeth1(i4, f2);
                    i4 *= i3;
                    break;
                default:
                    d += i4;
                    fArr1[i3 + 1] = i3;
                }
            }
            for (i12 = 1; i12 < 4; ++i12) {
                for (i14 = 2; i14 > 1; i14 -= 2) {
                    i15 += (int)Test.instanceCount;
                    f2 -= 4.209F;
                }
                Test.instanceCount = i4;
                iArr = iArr;
                f2 = i2;
            }
        }
        vMeth_check_sum += i2 + i3 + i4 + Double.doubleToLongBits(d) + by + Float.floatToIntBits(f2) + i12 + i13 + i14
            + i15 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i) {

        float f=0.889F;
        int i1=21, i16=-31789, iArr1[]=new int[N];
        double d2=2.122906;
        boolean b1=true;
        short s=14704;

        FuzzerUtils.init(iArr1, -12);

        for (f = 2; f < 232; ++f) {
            vMeth();
            d2 = i1;
            iArr1[(int)(f + 1)] = i;
            i16 = 1;
            while (++i16 < 7) {
                b1 = false;
                d2 *= -10;
                iArr1[i16] = i1;
                i1 += (-61458 + (i16 * i16));
                i += (int)-2.63472;
                i1 -= i16;
                s <<= (short)i1;
                i1 *= i16;
            }
        }
        i1 -= i1;
        i1 -= (int)-2.2384;
        long meth_res = i + Float.floatToIntBits(f) + i1 + Double.doubleToLongBits(d2) + i16 + (b1 ? 1 : 0) + s +
            FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i17=1675, i18=180, i19=12, i20=-31123, i21=15, i22=38, i23=2, i24=-9, i25=131, i26=519, iArr2[]=new int[N];
        double d3=-23.4832, dArr[][]=new double[N][N];
        boolean b2=true, bArr[][]=new boolean[N][N];
        float f3=0.177F, fArr2[]=new float[N];

        FuzzerUtils.init(fArr2, -1.609F);
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(dArr, 0.116175);
        FuzzerUtils.init(iArr2, 34533);

        iMeth(i17);
        fArr2[(i17 >>> 1) % N] = (float)d3;
        for (i18 = 19; i18 < 373; ++i18) {
            i17 ^= 151;
            i17 += (int)1.303F;
            switch ((i18 % 2) + 94) {
            case 94:
                b2 = b2;
                i20 = 1;
                while (++i20 < 71) {
                    i19 >>= Test.byFld;
                    for (i21 = 1; 1 > i21; ++i21) {
                        i17 -= sFld;
                        i19 >>= (int)Test.instanceCount;
                        i19 -= i19;
                        f3 += (-24840 + (i21 * i21));
                        bArr[i20 + 1][i18 - 1] = b2;
                        f3 += (i21 - i21);
                        sFld += (short)(14L + (i21 * i21));
                        i22 += (((i21 * Test.instanceCount) + i17) - i18);
                        i19 -= i22;
                        Test.instanceCount += Test.instanceCount;
                    }
                    dArr = dArr;
                    if (b2) break;
                    fArr2[i20 + 1] -= 47476;
                    i22 <<= (int)Test.instanceCount;
                    iArr2[i18 - 1] ^= (int)1214440968524527487L;
                }
                break;
            case 95:
                for (i23 = 4; i23 < 71; ++i23) {
                    for (i25 = i23; i25 < 2; i25++) {
                        d3 -= Test.instanceCount;
                        if (b2) break;
                        i19 &= 61;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
