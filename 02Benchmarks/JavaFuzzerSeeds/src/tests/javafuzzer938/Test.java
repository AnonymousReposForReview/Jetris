package tests.javafuzzer938;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:50:26 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=0L;
    public static double dFld=15.124241;
    public static volatile int iArrFld[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, 119);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i3, boolean b) {

        int i4=-36970, i5=-4, i6=28372, i7=59433, i8=251, i9=18309, iArr[]=new int[N];
        float f=101.814F;
        short s=-13206;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 0.64242);
        FuzzerUtils.init(iArr, 235);

        for (i4 = 5; 121 > i4; i4++) {
            for (f = 1; f < 13; ++f) {
                i5 &= s;
                for (i7 = 1; i7 < 2; ++i7) {
                    Test.instanceCount += Test.instanceCount;
                    i3 -= i7;
                }
                i5 = 152;
                dArr[i4 + 1] *= i3;
                i5 = (int)Test.instanceCount;
            }
            i9 = 1;
            while (++i9 < 13) {
                i3 *= i5;
                iArr[i9 - 1] <<= i7;
                iArr[i9 - 1] ^= 8;
                i5 *= -39097;
                i8 += (((i9 * Test.instanceCount) + i8) - i5);
            }
        }
        long meth_res = i3 + (b ? 1 : 0) + i4 + i5 + Float.floatToIntBits(f) + i6 + s + i7 + i8 + i9 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(long l, long l1) {

        byte by=45;
        boolean b1=true;
        float f1=0.29F;
        long l2=2044205794L;
        int i10=-76, i11=-2, i12=-13, i13=43124, i14=-12;

        by = (byte)(iMeth(53, b1) + f1);
        for (l2 = 9; l2 < 334; ++l2) {
            for (i11 = 1; i11 < 5; ++i11) {
                i12 = i10;
                i10 = i12;
                i10 = (int)f1;
                Test.dFld = f1;
                Test.dFld *= i11;
                Test.instanceCount += 16;
                i10 += i11;
                if (b1) continue;
            }
            for (i13 = 1; i13 < 5; i13++) {
                l &= i10;
            }
            i10 ^= i12;
            i12 = (int)3754859007L;
        }
        vMeth1_check_sum += l + l1 + by + (b1 ? 1 : 0) + Float.floatToIntBits(f1) + l2 + i10 + i11 + i12 + i13 + i14;
    }

    public void vMeth(int i, int i1, int i2) {

        int i15=-25655, i16=47873, i17=1, i18=5, iArr1[]=new int[N];
        float f2=119.538F;
        long l3=2727979316503640076L;
        double dArr1[]=new double[N];

        FuzzerUtils.init(dArr1, -33.5927);
        FuzzerUtils.init(iArr1, -2898);

        vMeth1(Test.instanceCount, Test.instanceCount);
        i15 = 249;
        while ((i15 -= 3) > 0) {
            for (i16 = 1; i16 < 19; i16++) {
                i17 -= (int)Test.instanceCount;
                switch ((((i1 >>> 1) % 9) * 5) + 76) {
                case 114:
                    dArr1[i15 + 1] += Test.instanceCount;
                    break;
                case 100:
                    iArr1[i16 - 1] <<= i1;
                    break;
                case 99:
                    i |= -17195;
                    f2 = Test.instanceCount;
                case 81:
                    f2 = f2;
                    for (l3 = 1; l3 < 2; ++l3) {
                        f2 = i2;
                        i17 *= (int)l3;
                        i2 -= i;
                        iArr1[i16] = 63771;
                    }
                    break;
                case 87:
                    i1 = i16;
                    break;
                case 93:
                    f2 *= -18;
                    break;
                case 91:
                    Test.instanceCount ^= Test.instanceCount;
                    break;
                case 96:
                    f2 += f2;
                    break;
                case 77:
                    Test.instanceCount = Test.instanceCount;
                    break;
                }
            }
        }
        vMeth_check_sum += i + i1 + i2 + i15 + i16 + i17 + Float.floatToIntBits(f2) + l3 + i18 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr1)) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        int i19=55385, i20=-144, i21=210, i22=31729, i23=-249, i24=-3, i25=132;
        float f3=-1.659F;
        short s1=26935;
        byte by1=-55;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);

        vMeth(i19, i19, 85);
        Test.instanceCount += (long)f3;
        for (i20 = 8; i20 < 204; i20++) {
            Test.instanceCount += i20;
            for (i22 = 1; i22 < 128; i22++) {
                Test.instanceCount += (41 + (i22 * i22));
                for (i24 = 2; i24 > 1; i24--) {
                    i19 += i20;
                    Test.instanceCount += i20;
                    i25 *= i21;
                    Test.instanceCount *= s1;
                    switch (((i19 >>> 1) % 1) + 106) {
                    case 106:
                        by1 = (byte)Test.instanceCount;
                        break;
                    default:
                        Test.dFld -= i21;
                        i25 <<= i21;
                        switch ((i24 % 3) + 106) {
                        case 106:
                        case 107:
                            if (false) continue;
                            i25 += i24;
                            break;
                        case 108:
                            i19 += i24;
                            switch ((i24 % 6) + 60) {
                            case 60:
                                bArr = bArr;
                                Test.instanceCount *= (long)-2.18225;
                                by1 += (byte)Test.dFld;
                                break;
                            case 61:
                                i25 &= (int)143L;
                                i19 += (i24 + i24);
                                Test.iArrFld = FuzzerUtils.int2array(N, (int)-63362);
                                break;
                            case 62:
                                Test.instanceCount = i24;
                                i19 = i24;
                                break;
                            case 63:
                                f3 -= i24;
                                f3 = -9060;
                                break;
                            case 64:
                                i19 += (int)-1931404195L;
                            case 65:
                                s1 += (short)-4L;
                                break;
                            }
                            break;
                        default:
                            i23 &= -61965;
                        }
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
