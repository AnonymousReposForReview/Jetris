package tests.javafuzzer911;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:30:42 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=2785501956L;
    public static int iFld=184;
    public boolean bFld=false;
    public static boolean bArrFld[]=new boolean[N];
    public volatile double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i17, int i18, double d3) {

        int i19=-11, i20=103, i21=182, i22=39879, i23=-9, i24=60, i25=113, iArr2[][]=new int[N][N];
        boolean b=true, bArr1[][]=new boolean[N][N];
        float f2=-87.194F;
        byte by1=-85;
        long lArr1[]=new long[N];

        FuzzerUtils.init(bArr1, false);
        FuzzerUtils.init(iArr2, 4);
        FuzzerUtils.init(lArr1, -52260L);

        for (i19 = 12; i19 < 217; i19++) {
            i20 = (int)Test.instanceCount;
            i17 = 6;
            if (b) continue;
        }
        for (f2 = 1; f2 < 255; f2++) {
            i17 = (int)Test.instanceCount;
            for (i22 = 1; i22 < 6; ++i22) {
                Test.iFld &= by1;
                if (false) break;
                i20 = i24;
            }
        }
        i25 = 1;
        do {
            bArr1[i25][(i22 >>> 1) % N] = b;
            Test.instanceCount = i22;
            iArr2[i25 - 1][i25] += (int)Test.instanceCount;
            lArr1[i25] -= Test.instanceCount;
        } while (++i25 < 217);
        long meth_res = i17 + i18 + Double.doubleToLongBits(d3) + i19 + i20 + (b ? 1 : 0) + Float.floatToIntBits(f2) +
            i21 + i22 + i23 + by1 + i24 + i25 + FuzzerUtils.checkSum(bArr1) + FuzzerUtils.checkSum(iArr2) +
            FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(double d2, int i7) {

        int i8=-61011, i9=-56781, i11=1, i12=-10, i13=11696, i14=-21350, i15=3, i16=-49567, i26=-36196, iArr1[]=new
            int[N];
        long l=-4537542216132513440L;
        boolean b1=true;

        FuzzerUtils.init(iArr1, 206);

        for (i8 = 392; i8 > 14; i8--) {
            Test.instanceCount += (i7--);
            switch (((i8 % 8) * 5) + 10) {
            case 14:
                for (i11 = i8; i11 < 4; i11++) {
                    for (i13 = 1; i13 < 1; ++i13) {
                        i12 += (((i13 * i9) + i12) - i12);
                    }
                    Test.iFld = (int)((--i15) + ((Test.instanceCount + Test.instanceCount) - iArr1[i8]));
                    Test.instanceCount += (((i11 * i8) + Test.instanceCount) - i13);
                    i16 = 1;
                    while (++i16 < 1) {
                        i15 = (int)(((i12 - Test.instanceCount) * iMeth(i7, Test.iFld, d2)) * d2);
                        Test.iFld = Test.iFld;
                    }
                    l = 1;
                    while (++l < 1) {
                        Test.iFld += 21461;
                        iArr1[i11] = Test.iFld;
                        i26 -= Test.iFld;
                    }
                }
                break;
            case 17:
                i9 += Test.iFld;
                break;
            case 12:
                i15 -= i26;
                break;
            case 34:
                i9 += i8;
                break;
            case 47:
                i14 *= i14;
                break;
            case 27:
                Test.bArrFld[i8 - 1] = b1;
                break;
            case 40:
                i15 >>= (int)Test.instanceCount;
            case 11:
                iArr1[i8] <<= (int)-673490691739895700L;
                break;
            }
        }
        vMeth1_check_sum += Double.doubleToLongBits(d2) + i7 + i8 + i9 + i11 + i12 + i13 + i14 + i15 + i16 + l + i26 +
            (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i4) {

        int i5=-11, i6=-25, i28=160, iArr[]=new int[N];
        float f1=-83.406F;
        double d1=-71.73372;
        short s=-10888;
        long lArr[]=new long[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr, -173);
        FuzzerUtils.init(lArr, 53L);
        FuzzerUtils.init(byArr, (byte)6);

        i5 = 1;
        while ((i5 += 2) < 186) {
            Test.instanceCount += i5;
            Test.instanceCount -= (((++Test.instanceCount) - Math.abs(Test.instanceCount)) + (i4++));
            Test.iFld = Math.max(iArr[i5]--, (int)(i5 - (i5 + f1)));
            i6 = 1;
            while (++i6 < 17) {
                iArr[i5] += (int)(lArr[i6 - 1] += (long)(-(-(d1 * i6))));
            }
            vMeth1(0.96589, i6);
            i28 = 1;
            while (++i28 < 17) {
                Test.instanceCount *= (long)f1;
                d1 += s;
                Test.instanceCount += (i28 - i5);
                f1 -= i5;
                i4 += (int)Test.instanceCount;
                try {
                    Test.iFld = (i5 / i4);
                    i4 = (-85 / Test.iFld);
                    Test.iFld = (i6 / -109);
                } catch (ArithmeticException a_e) {}
                byArr[i28 - 1] += (byte)f1;
            }
        }
        vMeth_check_sum += i4 + i5 + Float.floatToIntBits(f1) + i6 + Double.doubleToLongBits(d1) + i28 + s +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(byArr);
    }

    public void mainTest(String[] strArr1) {

        double d=-59.97664;
        byte by=-92;
        int i=-18625, i1=-47650, i2=7, i3=-4, i29=-19601, i30=6526, i31=-14194, i32=55012, i33=-44877, i34=-11702,
            iArr3[]=new int[N];
        float f=-1.962F;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(iArr3, -123);

        d = by;
        by = (byte)((Test.iFld--) - ((Test.iFld + Test.iFld) - (++d)));
        bArr[(Test.iFld >>> 1) % N] = (bFld = (bFld && (bFld && bFld)));
        for (i = 391; i > 11; i -= 2) {
            Test.iFld = (int)Test.instanceCount;
        }
        for (i2 = 128; i2 > 4; i2 -= 3) {
            by += (byte)(i2 * f);
            i1 += i1;
            vMeth(i2);
            Test.iFld = (int)f;
            i1 = i2;
            i3 += (((i2 * i3) + by) - Test.instanceCount);
            Test.iFld &= i1;
            d += 5117208973451359067L;
            iArr3 = iArr3;
        }
        i3 *= i2;
        for (i29 = 236; i29 > 7; i29--) {
            if (bFld) continue;
            dArrFld[i29] = i1;
            i1 += (i29 | Test.instanceCount);
            i30 -= i2;
            f = i2;
            for (i31 = i29; i31 < 110; i31++) {
                Test.iFld += i31;
                if (bFld) continue;
                if (bFld) {
                    for (i33 = 1; i33 < 1; ++i33) {
                        i30 -= (int)d;
                    }
                } else {
                    i3 += i;
                    d = i3;
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
