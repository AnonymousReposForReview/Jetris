package tests.javafuzzer991;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:38:20 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=8280L;
    public double dFld=-8.51112;
    public long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -26119);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static int iMeth2(int i7, int i8) {

        int i9=-6363, i10=38760, i11=36395, i12=-11, i13=226, i14=7;
        boolean b=true, bArr[]=new boolean[N];
        float f1=1.492F;
        double d=-46.15410;

        FuzzerUtils.init(bArr, false);

        for (i9 = 4; i9 < 177; i9++) {
            bArr[i9] = b;
            i8 += (i9 ^ i8);
        }
        for (f1 = 3; 384 > f1; ++f1) {
            i12 = 1;
            do {
                i8 ^= (int)-6L;
                i8 <<= i11;
                i10 -= 5;
                i7 += (int)d;
                for (i13 = 1; 1 < i13; i13 -= 3) {
                    i10 *= i9;
                    i7 += i13;
                    i7 += 1;
                }
                i10 += (((i12 * i9) + i11) - i10);
                i11 = -6159;
            } while (++i12 < 4);
        }
        long meth_res = i7 + i8 + i9 + i10 + (b ? 1 : 0) + Float.floatToIntBits(f1) + i11 + i12 +
            Double.doubleToLongBits(d) + i13 + i14 + FuzzerUtils.checkSum(bArr);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(int i6) {

        float f=119.286F;
        int i15=37, i16=-13, i17=-4, i18=-131, i19=-61, i20=41;
        short s=7788;
        double d1=0.109031;

        f -= iMeth2(i6, i6);
        for (i15 = 12; i15 < 301; i15++) {
            for (i17 = i15; i17 < 6; i17++) {
                boolean b1=true;
                s = s;
                Test.iArrFld[i15 - 1] += (int)Test.instanceCount;
                b1 = b1;
                i19 = 1;
                while (++i19 < 1) {
                    Test.instanceCount = Test.instanceCount;
                    f += (-8 + (i19 * i19));
                }
                try {
                    Test.iArrFld[i15 - 1] = (33085 % i15);
                    i6 = (i6 / -132);
                    i20 = (Test.iArrFld[i15 - 1] / Test.iArrFld[i15]);
                } catch (ArithmeticException a_e) {}
                try {
                    i18 = (Test.iArrFld[i17 - 1] % -47056);
                    i20 = (-5267 % i17);
                    i18 = (i15 % i20);
                } catch (ArithmeticException a_e) {}
                if (b1) continue;
                i18 = i17;
                i20 -= i17;
                d1 *= i20;
            }
        }
        long meth_res = i6 + Float.floatToIntBits(f) + i15 + i16 + i17 + i18 + s + i19 + i20 +
            Double.doubleToLongBits(d1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth(long l, int i1) {

        int i2=49707, i3=-4, i4=-2, i5=-32808, i21=-13, i22=64753, iArr[]=new int[N];
        double d2=81.64102, d3=0.53569;
        boolean b2=false;

        FuzzerUtils.init(iArr, -9);

        for (i2 = 5; i2 < 162; ++i2) {
            for (i4 = 1; 10 > i4; ++i4) {
                l += (14 + (i4 * i4));
                try {
                    i1 = (iArr[i2 + 1] / i2);
                    i5 = (-33287 % i2);
                    i1 = (1302278279 % i2);
                } catch (ArithmeticException a_e) {}
                lArrFld[i4] *= (long)((iMeth1(i3) - d2) + i3);
            }
            i3 = i3;
            iArr[i2 + 1] = i2;
        }
        switch (((-239 >>> 1) % 6) + 76) {
        case 76:
            i21 = 1;
            while (++i21 < 249) {
                Test.iArrFld[i21] = (int)l;
                if (b2) continue;
                d2 *= i1;
                for (d3 = i21; d3 < 7; d3++) {
                    i5 = (int)Test.instanceCount;
                    i1 += (int)l;
                }
            }
            break;
        case 77:
            iArr = iArr;
            break;
        case 78:
            i1 = i21;
        case 79:
            b2 = true;
            break;
        case 80:
            Test.instanceCount >>= i22;
            break;
        case 81:
            i5 += i3;
            break;
        default:
            d2 -= i2;
        }
        long meth_res = l + i1 + i2 + i3 + i4 + i5 + Double.doubleToLongBits(d2) + i21 + (b2 ? 1 : 0) +
            Double.doubleToLongBits(d3) + i22 + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=39159, i23=14, i24=1, i25=11, i26=9, i27=215, i28=81, i29=-31569, i30=-30073, i31=18705, i32=11, i33=-211;
        boolean b3=false;
        long l1=23452L;
        float f2=72.218F;
        byte by=105;

        i = (i = (i += iMeth(Test.instanceCount, i)));
        b3 = b3;
        for (l1 = 4; l1 < 255; ++l1) {
            i23 -= i23;
            for (i24 = 4; i24 < 100; i24++) {
                f2 = Test.instanceCount;
                Test.instanceCount |= Test.instanceCount;
                by += (byte)3539919465625736844L;
                f2 -= Test.instanceCount;
                Test.iArrFld[i24 + 1] *= (int)Test.instanceCount;
                i23 = i;
                Test.instanceCount += i23;
            }
            Test.instanceCount = -8375;
            for (i26 = 3; 100 > i26; ++i26) {
                i27 += (i26 - i26);
                if (b3) {
                    Test.iArrFld[i26 + 1] -= i27;
                    lArrFld[i26 + 1] -= i25;
                }
                Test.instanceCount = i23;
            }
        }
        for (i28 = 11; 234 > i28; ++i28) {
            if (b3) {
                Test.instanceCount *= i25;
                for (i30 = 113; i30 > 4; --i30) {
                    for (i32 = 1; 2 > i32; i32++) {
                        i += -9429;
                        Test.iArrFld = Test.iArrFld;
                        if (b3) break;
                    }
                    f2 += (float)dFld;
                    i33 *= (int)Test.instanceCount;
                    by += (byte)(i30 * i30);
                }
            } else if (false) {
                i31 += (((i28 * f2) + i31) - i31);
            } else {
                b3 = b3;
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}