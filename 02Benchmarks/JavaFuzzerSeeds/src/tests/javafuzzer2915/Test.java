package tests.javafuzzer2915;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 22:58:34 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=45L;
    public static double dFld=-9.44315;
    public short sFld=-906;
    public boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public short sArrFld[][]=new short[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 45068);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static long lMeth(short s, int i5) {

        int i6=-11, i7=153, i8=-6, i9=0, i10=-43152, i11=8, i12=59377, i13=-24190, i14=161;
        boolean b=false, bArr[]=new boolean[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -55608L);
        FuzzerUtils.init(bArr, true);

        for (i6 = 13; i6 < 287; i6++) {
            float f=2.536F;
            f -= i6;
            for (i8 = 1; i8 < 6; i8++) {
                i10 = (int)Test.instanceCount;
                for (i11 = i8; i11 < 2; i11++) {
                    f *= 61;
                }
            }
            lArr = lArr;
            i5 *= (int)Test.instanceCount;
            f *= i10;
            switch ((i6 % 2) + 83) {
            case 83:
            case 84:
                for (i13 = 1; i13 < 6; ++i13) {
                    Test.iArrFld[i13] >>>= (int)Test.instanceCount;
                    bArr[i6 + 1] = b;
                    i10 >>>= -46304;
                    i7 = i11;
                }
                break;
            }
        }
        long meth_res = s + i5 + i6 + i7 + i8 + i9 + i10 + i11 + i12 + i13 + i14 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(bArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(int i3, int i4, long l1) {

        short s1=-15460;
        float f1=-14.433F, fArr[]=new float[N];
        int i15=-14, i16=58291, i17=211, i18=-13, i19=5;
        boolean b1=false;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -125.40634);
        FuzzerUtils.init(fArr, -22.450F);

        Test.dFld *= (i4 - (l1 - (--i3)));
        dArr[(i3 >>> 1) % N] = (lMeth(s1, i3) + i4);
        Test.dFld = Test.dFld;
        Test.iArrFld[(i4 >>> 1) % N] = (int)Test.instanceCount;
        f1 *= l1;
        Test.iArrFld[(i4 >>> 1) % N] = i3;
        for (i15 = 5; i15 < 209; i15 += 3) {
            for (i17 = 23; i17 > 1; --i17) {
                i19 = 1;
                do {
                    fArr[i19 - 1] = Test.instanceCount;
                    i18 >>= 12;
                    i18 += -31719;
                } while (++i19 < 2);
                i18 += i17;
                if (b1) continue;
                l1 += i17;
            }
        }
        long meth_res = i3 + i4 + l1 + s1 + Float.floatToIntBits(f1) + i15 + i16 + i17 + i18 + i19 + (b1 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(long l, int i1, int i2) {

        int i20=2, i21=54277, i22=-8, i23=9, i24=65508, i25=-56632, i26=31357, i27=-4, i28=13, i29=-11, i30=4707;
        byte by=71;
        float f2=0.833F;
        boolean b2=false;
        double d=1.105253;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 123L);

        Test.iArrFld[(i2 >>> 1) % N] = (int)(iMeth(i2, i2, Test.instanceCount) * Test.dFld);
        for (i20 = 10; i20 < 342; i20++) {
            by += (byte)(i20 + l);
        }
        for (f2 = 8; f2 < 242; f2++) {
            i21 += (int)Test.instanceCount;
        }
        for (i23 = 236; i23 > 12; i23--) {
            b2 = b2;
        }
        Test.dFld *= i24;
        for (d = 8; d < 207; ++d) {
            by *= (byte)1;
            for (i26 = 1; i26 < 8; ++i26) {
                for (i28 = 1; i28 < 2; i28++) {
                    lArr1[i26 - 1] <<= -66;
                    i25 = i22;
                    i30 >>= 8;
                }
            }
        }
        vMeth_check_sum += l + i1 + i2 + i20 + i21 + by + Float.floatToIntBits(f2) + i22 + i23 + i24 + (b2 ? 1 : 0) +
            Double.doubleToLongBits(d) + i25 + i26 + i27 + i28 + i29 + i30 + FuzzerUtils.checkSum(lArr1);
    }

    public void mainTest(String[] strArr1) {

        float f3=31.51F;
        byte by1=-102;
        int i31=-44099, i32=54, i33=11, i34=30, i35=-1, iArr[]=new int[N];
        double d1=0.28192;

        FuzzerUtils.init(iArr, 18);

        for (int i : iArr) {
            vMeth(Test.instanceCount, i, i);
            switch ((((i >>> 1) % 2) * 5) + 36) {
            case 40:
                Test.instanceCount -= i;
            case 41:
                f3 = 1;
                while (++f3 < 63) {
                    by1 = (byte)-144;
                    for (i31 = 1; i31 < 1; i31 += 3) {
                        float f4=2.326F;
                        i32 = i32;
                        sFld -= (short)i32;
                        i <<= i31;
                        i32 = i31;
                        switch ((int)((f3 % 2) + 67)) {
                        case 67:
                            f4 = 1806L;
                        case 68:
                            i32 += i32;
                            i32 -= by1;
                            break;
                        }
                        if (true) continue;
                        Test.instanceCount *= (long)f3;
                        i += (i31 | i31);
                    }
                }
                for (d1 = 1; 63 > d1; d1++) {
                    i33 *= i31;
                    i32 >>= i32;
                    Test.iArrFld = Test.iArrFld;
                    for (i34 = (int)(d1); i34 < 2; ++i34) {
                        i33 += (i34 * i34);
                        i33 += (((i34 * Test.instanceCount) + i35) - i31);
                        sArrFld[(int)(d1 + 1)][i34 - 1] -= (short)-2763251625L;
                    }
                }
                switch (((i32 >>> 1) % 1) + 124) {
                case 124:
                    if (true) {
                        sFld *= (short)Test.instanceCount;
                    }
                    if (bFld) break;
                    break;
                default:
                    Test.iArrFld[(i31 >>> 1) % N] = (int)Test.instanceCount;
                }
                break;
            default:
                Test.iArrFld[(i34 >>> 1) % N] -= sFld;
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
//DEBUG  lMeth ->  lMeth iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
