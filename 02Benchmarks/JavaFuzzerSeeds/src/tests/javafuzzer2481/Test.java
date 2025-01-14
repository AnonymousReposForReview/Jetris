package tests.javafuzzer2481;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 15:22:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=17835L;
    public static volatile float fFld=-2.86F;
    public static volatile short sFld=28799;
    public static byte byFld=7;
    public static double dFld=-1.82148;
    public int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 49L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(int i1, float f) {

        int i2=55, i3=-2713, i4=14, iArr1[]=new int[N];
        boolean b=false, bArr[]=new boolean[N];
        double d=113.110764;
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr1, 3);
        FuzzerUtils.init(bArr, true);
        FuzzerUtils.init(sArr, (short)-7089);

        i2 = 1;
        do {
            i1 = i1;
            i1 = (int)Test.instanceCount;
            Test.instanceCount -= i1;
            i3 += i2;
            if (b) break;
            iArr1[i2] -= (int)Test.instanceCount;
            bArr[i2 + 1] = b;
            try {
                iArr1[i2] = (i2 % i1);
                iArr1[i2] = (i4 % -4214);
                i3 = (31594 / i2);
            } catch (ArithmeticException a_e) {}
            i3 += (((i2 * i4) + i2) - Test.instanceCount);
            d += Test.instanceCount;
        } while (++i2 < 267);
        f = Test.instanceCount;
        for (short s1 : sArr) {
            d -= i1;
            if (i3 != 0) {
            }
        }
        long meth_res = i1 + Float.floatToIntBits(f) + i2 + i3 + (b ? 1 : 0) + i4 + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(bArr) + FuzzerUtils.checkSum(sArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vMeth1() {

        int i5=-45345, i6=-205, i7=9, i8=-28825, i9=-101, i10=-10849, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, 99);

        lMeth(i5, Test.fFld);
        Test.sFld += (short)i5;
        i5 = i5;
        for (i6 = 1; i6 < 133; i6++) {
            Test.instanceCount = Test.instanceCount;
            iArr2[i6 - 1] = i6;
            i8 = 12;
            do {
                i5 += (((i8 * i5) + i6) - i5);
            } while (--i8 > 0);
        }
        i7 &= (int)116L;
        for (i9 = 16; i9 < 360; i9++) {
            i10 <<= i10;
            i5 += -1;
            try {
                i7 = (9365 / i6);
                i7 = (-64293 / i7);
                i5 = (i10 % 28);
            } catch (ArithmeticException a_e) {}
            i10 = -172;
            i10 >>>= -27551;
        }
        vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + i10 + FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth(int i) {

        short s=-11873, sArr1[]=new short[N];
        int i11=-26956, i12=39, i13=-10, i14=-14, i15=2057, i16=12, i17=168, iArr[]=new int[N];
        boolean b1=false;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(iArr, -164);
        FuzzerUtils.init(lArr, 886815545L);
        FuzzerUtils.init(sArr1, (short)-30253);

        iArr[(-14 >>> 1) % N] = (-s);
        vMeth1();
        for (i11 = 11; i11 < 245; i11++) {
            Test.instanceCount += i11;
            i += i12;
        }
        lArr[(i11 >>> 1) % N][(i12 >>> 1) % N] = Test.instanceCount;
        for (i13 = 7; i13 < 287; i13++) {
            if (b1) {
                if (false) break;
                Test.byFld += (byte)Test.dFld;
            } else if (b1) {
                iArr[i13] *= (int)Test.instanceCount;
                try {
                    i14 = (i15 / 43245);
                    iArr[i13 + 1] = (6842 % i13);
                    i12 = (53393 / i13);
                } catch (ArithmeticException a_e) {}
            }
            for (i16 = 1; i16 < 6; ++i16) {
                s *= (short)-193L;
            }
        }
        i17 = Test.sFld;
        vMeth_check_sum += i + s + i11 + i12 + i13 + i14 + i15 + (b1 ? 1 : 0) + i16 + i17 + FuzzerUtils.checkSum(iArr)
            + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(sArr1);
    }

    public void mainTest(String[] strArr1) {

        int i18=12, i20=4, i21=145, i22=232, i23=10, i24=-9, i25=-167, i26=10, i27=-2540;
        boolean b2=true;
        short sArr2[]=new short[N];

        FuzzerUtils.init(sArr2, (short)-20229);

        vMeth(i18);
        i18 -= (int)11941L;
        i18 *= (int)Test.fFld;
        for (int i19 : iArrFld) {
            i19 += (int)Test.instanceCount;
        }
        try {
            sArr2[(i18 >>> 1) % N] <<= (short)i18;
            i20 = 1;
            do {
                for (i21 = i20; i21 < (99 + 400); i21++) {
                    if (b2) continue;
                    if (b2) break;
                    Test.fFld += i21;
                    i22 >>= i21;
                    Test.dFld -= i22;
                }
                i22 = i22;
                i18 += (i20 + i21);
                i18 = -45321;
            } while (++i20 < 254);
            i22 = 0;
            for (short s3 : sArr2) {
                iArrFld[(i22 >>> 1) % N] *= i22;
                i18 = i18;
                for (i23 = 3; i23 < (63 + 400); i23++) {
                    Test.instanceCount += i21;
                    for (i25 = 1; i25 < (1 + 400); i25++) {
                        Test.lArrFld[i23 - 1] >>>= i20;
                    }
                    iArrFld = FuzzerUtils.int1array(N, (int)-2);
                    i22 += i23;
                }
                i27 = 63;
                do {
                    i22 = i27;
                } while (--i27 > 0);
                Test.instanceCount = i24;
            }
        }
        catch (ArrayIndexOutOfBoundsException exc1) {
            Test.instanceCount += i25;
        }
        finally {
            iArrFld[(i25 >>> 1) % N] *= i26;
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
//DEBUG  lMeth ->  lMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
